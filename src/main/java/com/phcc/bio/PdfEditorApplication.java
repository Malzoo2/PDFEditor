package com.phcc.bio;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdfEditorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfEditorApplication.class, args);
		
		try {
			PDFEditor.main(args);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
