package com.iotest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static final String DATA_FILE = "test.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void writeSomething(String text){
		try(FileWriter writer = new FileWriter(DATA_FILE,true)){
			
			char[] buffer = text.toCharArray();
			writer.write(buffer);
			writer.flush();
			
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	static void readSomething(){
		String str= "";
		try(FileReader reader = new FileReader(DATA_FILE)){
			
			char[] buffer = new char[100];
			int len = reader.read(buffer);
			while(len>0){
				
				len = reader.read(buffer,0,len);
				
			}
			
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
