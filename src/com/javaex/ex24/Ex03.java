package com.javaex.ex24;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Point p01=new Point(2,3);
		
		p01.draw();
		
		Point p02;
		
		System.out.println("안녕하세요");
		
		try {
			p02=null; //p02=new Point(100, 100);
			p02.draw();
				
		}catch(NullPointerException e) {
			System.out.println(e.toString());
			System.out.println("주소값이 없습니다");
		}
		
		
		
	}
}
