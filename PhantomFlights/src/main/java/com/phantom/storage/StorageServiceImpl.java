package com.phantom.storage;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageServiceImpl implements StorageService {

	private final Path rootLocation;
	private final Path datLocation;
	private final Path csvLocation;
	private final Path jsonLocation;

	@Autowired
	public StorageServiceImpl(StorageProperties properties) {
		this.rootLocation = Paths.get(properties.getLocation());
		this.datLocation = this.path(properties.getDat());
		this.csvLocation = this.path(properties.getCsv());
		this.jsonLocation = this.path(properties.getJson());
	}

	@Override
	public boolean storeDat(MultipartFile file) {
		Path path = this.datLocation.resolve(file.getOriginalFilename());

		if (Files.exists(path)) {
			return false;
		}

		try {
			if (file.isEmpty()) {
				throw new StorageException("Failed to store empty file " + file.getOriginalFilename());
			}
			Files.copy(file.getInputStream(), path);
		} catch (IOException e) {
			throw new StorageException("Failed to store file " + file.getOriginalFilename(), e);
		}

		return true;
	}

	@Override
	public boolean storeJson(Path path, String data) {
		if (Files.exists(path)) {
			return false;
		}

		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(path.toAbsolutePath().toString()), "utf-8"))) {
			writer.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public Stream<Path> loadAllDat() {
		return this.loadAll(this.datLocation);
	}

	@Override
	public Stream<Path> loadAllCsv() {
		return this.loadAll(this.csvLocation);
	}

	@Override
	public Stream<Path> loadAllJson() {
		return this.loadAll(this.jsonLocation);
	}

	private Stream<Path> loadAll(Path location) {
		try {
			return Files.walk(location, 1).filter(path -> !path.equals(location))
					.map(path -> location.relativize(path));
		} catch (IOException e) {
			throw new StorageException("Failed to read stored files", e);
		}
	}

	@Override
	public Path path(String filename) {
		return this.rootLocation.resolve(filename);
	}

	@Override
	public Path datPath(String filename) {
		return this.datLocation.resolve(filename);
	}

	@Override
	public Path csvPath(String filename) {
		return this.csvLocation.resolve(filename);
	}

	@Override
	public Path jsonPath(String filename) {
		return this.jsonLocation.resolve(filename);
	}

	@Override
	public Resource loadAsResource(String filename) {
		try {
			Path file = path(filename);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new StorageFileNotFoundException("Could not read file: " + filename);
			}
		} catch (MalformedURLException e) {
			throw new StorageFileNotFoundException("Could not read file: " + filename, e);
		}
	}

	@Override
	public void delete(Path file) {
		try {
			Files.delete(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAll() {
		FileSystemUtils.deleteRecursively(this.rootLocation.toFile());
	}

	@Override
	public void init() {
		try {
			if (!Files.exists(this.rootLocation)) {
				Files.createDirectory(this.rootLocation);
			}
			if (!Files.exists(this.datLocation)) {
				Files.createDirectory(this.datLocation);
			}
			if (!Files.exists(this.csvLocation)) {
				Files.createDirectory(this.csvLocation);
			}
			if (!Files.exists(this.jsonLocation)) {
				Files.createDirectory(this.jsonLocation);
			}
		} catch (IOException e) {
			throw new StorageException("Could not initialize storage", e);
		}
	}

}