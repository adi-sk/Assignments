package com.interfaces;

public class HardDisk implements Storage {

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.print("Reading storage");
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("writing on storage");
	}

}
