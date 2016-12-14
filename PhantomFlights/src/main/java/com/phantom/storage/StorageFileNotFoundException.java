package com.phantom.storage;

public class StorageFileNotFoundException extends StorageException {

	private static final long serialVersionUID = 6455974395115838353L;

	public StorageFileNotFoundException(String message) {
		super(message);
	}

	public StorageFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
