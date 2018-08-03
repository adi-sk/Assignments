package com.aditya.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFileApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Reading File through channel");
		FileInputStream fis = new FileInputStream("test1.txt");
		FileChannel in = fis.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(100);
		int readBytes = in.read(buffer); //write data in Buffer
		while(readBytes != -1){
			//flip to read mode
			buffer.flip();
			while(buffer.hasRemaining()){
				System.out.print((char)buffer.get());
			}
			buffer.clear();
			readBytes = in.read(buffer);
		}
		fis.close();
		
	}

}
