package com.javaex.ex11;

public class MathApp {
	
	public static void main(String[] args) {
		
		
		Math math=new Math();
		//메소드 오버로딩
		System.out.println(math.plus(2, 30));
		
		System.out.println(math.plus(2.2, 3));
		
		System.out.println(math.plus(3, 2.2));
		
		System.out.println(math.plus(2.2, 3.1));
		
		
		
		
		System.out.println(math.plus("안녕하세요 ", 2));
		
		
	}
}
