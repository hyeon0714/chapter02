package com.javaex.ex13;

public class MathApp {
	
	
	public static void main(String[] args) {
		
		System.out.println(Math.plus(2,3));
		System.out.println(Math.plus(5.5,40));
		//스태틱 영역의 메소드는 인스턴스객체가 없어도 바로 사용가능하다
		
		System.out.println(Math.circleArea(5));
	}
}
