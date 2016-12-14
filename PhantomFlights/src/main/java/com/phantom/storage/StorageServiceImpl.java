package com.phantom.storage;

import java.io.IOException;
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

	@Autowired
	public StorageServiceImpl(StorageProperties properties) {
		this.rootLocation = Paths.get(properties.getLocation());
		this.datLocation = this.load(properties.getDat());
		this.csvLocation = this.load(properties.getCsv());
	}

	@Override
	public void storeDat(MultipartFile file) {
		try {
			if (file.isEmpty()) {
				throw new StorageException("Failed to store empty file " + file.getOriginalFilename());
			}
			Files.copy(file.getInputStream(), this.datLocation.resolve(file.getOriginalFilename()));
		} catch (IOException e) {
			throw new StorageException("Failed to store file " + file.getOriginalFilename(), e);
		}
	}

	@Override
	public Stream<Path> loadAllDat() {
		return this.loadAll(this.datLocation);
	}
	
	@Override
	public Stream<Path> loadAllCsv() {
		return this.loadAll(this.csvLocation);
	}
	
	private Stream<Path> loadAll(Path location) {
		try {
			return Files.walk(location, 1)
					.filter(path -> !path.equals(location))
					.map(path -> location.relativize(path));
		} catch (IOException e) {
			throw new StorageException("Failed to read stored files", e);
		}

	}

	@Override
	public Path load(String filename) {
		return this.rootLocation.resolve(filename);
	}
	
	@Override
	public Path loadDat(String filename) {
		return this.datLocation.resolve(filename);
	}
	
	@Override
	public Path loadCsv(String filename) {
		return this.csvLocation.resolve(filename);
	}

	@Override
	public Resource loadAsResource(String filename) {
		try {
			Path file = load(filename);
			Resource resource = new UrlResource(file.toUri());
			if(resource.exists() || resource.isReadable()) {
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
			if(!Files.exists(this.rootLocation)){
				Files.createDirectory(this.rootLocation);
			}
			if(!Files.exists(this.datLocation)){
				Files.createDirectory(this.datLocation);
			}
			if(!Files.exists(this.csvLocation)){
				Files.createDirectory(this.csvLocation);
			}
		} catch (IOException e) {
			throw new StorageException("Could not initialize storage", e);
		}
	}
	
}