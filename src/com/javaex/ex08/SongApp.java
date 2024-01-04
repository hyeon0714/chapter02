package com.javaex.ex08;

public class SongApp {
	
	public static void main(String[] args) {
		
		Song a=new Song();
		
		System.out.println(a.toString());
		
		
		Song b=new Song("좋은날", "아이유"); 
		
		System.out.println(b.toString());
		
		Song c=new Song("좋은날", "아이유", "Real", "이민수 작곡");
		
		System.out.println(c.toString());
		
		Song d=new Song("좋은날", "아이유", "Real", "이민수 작곡", 2010, 3);
		System.out.println(d.toString());
		
	}
}
