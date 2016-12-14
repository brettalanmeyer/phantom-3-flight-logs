package com.phantom.storage;

public class StorageException extends RuntimeException {

	private static final long serialVersionUID = 883758921040286445L;

	public StorageException(String message) {
		super(message);
	}

	public StorageException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
