package com.javaex.ex04;

public class Point {
	//클래스
	//필드
	private int x;
	private int y;
	
	
	
	
	
	
	
	
	//게터/세터 메소드
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	//(여기서 get메소드는 일반메소드로 출력시 필요가 x?)
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	
	
	//일반 메소드
	public void draw() {
		System.out.println("점[x="+this.x+", y="+this.y+"]을 그렸습니다");
	}
	
}
