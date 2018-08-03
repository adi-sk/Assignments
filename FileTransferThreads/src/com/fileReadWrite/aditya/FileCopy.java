package com.fileReadWrite.aditya;

import java.io.*;

public class FileCopy implements Runnable {

	//Properties  
	
	private byte[] data = new byte[1000];
	FileOutputStream fileOutputSteam;
	FileInputStream fileInputSteam;
	
	
	public FileCopy(String source, String destination) throws FileNotFoundException {
		super();
		
		fileInputSteam = new FileInputStream(source);
		System.out.println("Source file found");
		fileOutputSteam = new FileOutputStream(destination, true);
		
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside run");
		try {
			while(fileInputSteam.read(data) != -1){
				fileOutputSteam.write(data);
			}
			
			System.out.println("File Copy done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
