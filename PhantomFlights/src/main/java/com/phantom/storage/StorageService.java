package com.phantom.storage;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {

	void init();

	void storeDat(MultipartFile file);

	public Stream<Path> loadAllDat();
	
	public Stream<Path> loadAllCsv();
	
	public Path load(String filename);
	
	public Path loadDat(String filename);
	
	public Path loadCsv(String filename);

	public Resource loadAsResource(String filename);

	public void delete(Path file);
	
	public void deleteAll();

}
