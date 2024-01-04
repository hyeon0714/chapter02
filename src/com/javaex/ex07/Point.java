package com.javaex.ex07;

public class Point {
	
	//필드
	private int x;
	private int y;
	private int z;
	
	//생성자
	public Point() {//1번
		System.out.println("Point()");
	}
	
	public Point(int x) {//2번
		this.x=x;
		System.out.println("Point(int x)");
	}
	/*
	public Point(int y) {//2번 생성자와 생성자가 같다고 인식해서 '오버로딩'이 동작못한다
		this.y=y;
	}
	*/
	public Point(int x, int y)	{//3번
		this(x);
		this.y=y;
		System.out.println("Point(int x, int y)");
	}
	public Point(int x, int y, int z) {//4번
		this(x, y);
		this.z=z;
		System.out.println("Point(int x, int y, int z)");
	}
	

	//게터,세터 메소드
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	//일반 메소드

	
	
	
	
}
