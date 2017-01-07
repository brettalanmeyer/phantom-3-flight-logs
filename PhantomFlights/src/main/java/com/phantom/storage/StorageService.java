package com.phantom.storage;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface StorageService {

	public void init();

	public boolean storeDat(MultipartFile file);

	public boolean storeJson(Path path, String data);

	public Stream<Path> loadAllDat();
	
	public Stream<Path> loadAllCsv();
	
	public Stream<Path> loadAllJson();
	
	public Path path(String filename);
	
	public Path datPath(String filename);
	
	public Path csvPath(String filename);

	public Path jsonPath(String filename);

	public Resource loadAsResource(String filename);

	public void delete(Path file);
	
	public void deleteAll();

}
