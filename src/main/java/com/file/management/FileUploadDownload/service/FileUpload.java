package com.file.management.FileUploadDownload.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUpload {
	
	/**
	 * this methods uses to upload a file into a folder called images
	 */
	
	public boolean saveFile(MultipartFile file) {
		
		return true;
	}
	
	


}
