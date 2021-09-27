package com.example.auto.Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class CreateFile {
	//File myFile = new File("./LocalFiles/display.html");
	
	public String CreatingFile() {
		try {
			File myObj = new File("./LocalFiles/display.html");
			if (myObj.createNewFile()) {
				 FileWriter myWriter = new FileWriter("./LocalFiles/display.html");
			      myWriter.write("<!DOCTYPE html>\r\n"
			      		+ "<html lang=\"en\">\r\n"
			      		+ "<head>\r\n"
			      		+ "    <meta charset=\"UTF-8\">\r\n"
			      		+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
			      		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
			      		+ "    <title>All Apps</title>\r\n"
			      		+ "</head>\r\n"
			      		+ "<body>\r\n"
			      		+ "<h1>Helo<h1>\r\n"
			      		+ "</body>\r\n"
			      		+ "</html>");
			      myWriter.close();
				return "File created: " + myObj.getName();
			} else {
				return "File already exists.";
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "An error occurred.";
			
		}
		
	}
}
