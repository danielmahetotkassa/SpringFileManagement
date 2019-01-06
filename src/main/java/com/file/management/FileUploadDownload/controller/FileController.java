package com.file.management.FileUploadDownload.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	
	private static String UPLOADED_FOLDER = "/Users/amisale/Desktop/upload/";
	private static final String FILE_PATH = "/Users/amisale/Desktop/Dani Documents/Birhane.docx";
	

	
	@RequestMapping("/file")
	public String getFileUploadForm() {
		
		return "fileupload";
	}
	
	@RequestMapping("/upload") 
    public String singleFileUpload(@RequestParam("file") MultipartFile file )
	throws Exception{

     
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);

            return "success";
    }

	
	   @GetMapping("/download")
	   public ResponseEntity<InputStreamResource> downloadFile1() throws IOException {

	      File file = new File(FILE_PATH);
	      InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

	      return ResponseEntity.ok()
	            .header(HttpHeaders.CONTENT_DISPOSITION,
	                  "attachment;filename=" + file.getName())
	            .contentType(MediaType.APPLICATION_PDF).contentLength(file.length())
	            .body(resource);
	   }

}
