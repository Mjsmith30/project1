package com.revature.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOITryWithResources {
	
	public static void main (String[] args) {
		
		File myfile = new File ("myfile.txt");
		
try (FileWriter writer = new FileWriter(myfile, true);
	BufferedWriter buffWriter = new BufferedWriter(writer)){
	buffWriter.write("resources");
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	}
}
