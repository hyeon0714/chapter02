package com.javaex.ex25;

import java.io.IOException;

public class MyFile {
	
	public String read(String paht) {
		return "학교종이 땡땡땡";//파일이 잇는경우
	}
	
	
	public String read2(String paht) {
		String result= "";//파일이 없는경우
		
		try {
			//파일이 없는 상황을 강제로 발생
			throw new IOException();		
		}catch(IOException e) {
			System.out.println("파일이 없습니다");
		}
		return result;
		
	}
	
	public String read3(String path) throws IOException {
		String result="";
		
		throw new IOException();
		
		
	}
}
