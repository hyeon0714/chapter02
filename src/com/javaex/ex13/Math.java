package com.javaex.ex13;

public class Math {
	
	//필드-생략
	private final static double pi=3.14;
	
	//생성자-생략
	
	
	//게터세터
	
	
	//일반//일반 메소드를 클래스 변수 설정
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(double a, int b) {
		return a+b;
	}
	
	public static double plus(int a, double b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;	
	}
	
	public static double circleArea(int r) {
		return r*r*pi;//pi라는 변수를 사용하고 싶으면 pi라는 변수를 스태틱 영역에 생성해야한다(스태틱 영역이 먼저 실행후 힙영역이 진행!)
	}
	
	
}
