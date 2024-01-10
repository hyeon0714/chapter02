package com.javaex.ex25;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
		
		MyFile a=new MyFile();
		
		String str=a.read("C:/aaa.txt");
		
		System.out.println(str);
		
		
		
		MyFile b=new MyFile();
		
		String sss =b.read2("c:/bbb.txt");
		System.out.println(sss);
		
		
		
		MyFile c=new MyFile();
		try {
			String s=c.read3("c:/bb.txt");	
		}catch(IOException e) {
			System.out.println("파일 없음");
		}
		
		
	}
}
