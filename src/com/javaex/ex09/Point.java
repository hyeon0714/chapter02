package com.javaex.ex09;

public class Point {
	//필드
	private int x;
	private int y;
	private int z;
	
	//생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(int x, int y, int z) {
		this(x,y);
		this.z=z;
	}
	
	
	//g/s
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
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	//일반 메소드
	public void draw() {
		System.out.println("점[x="+this.x+", y="+this.y+"]을 그렸습니다");
	}
	//일반 메소드 오버로딩
	public void draw(boolean action) {
		if(action==true) {
			System.out.println("점[x="+this.x+", y="+this.y+"]을 그렸습니다");
		}else {
			System.out.println("점[x="+this.x+", y="+this.y+"]을 지웠습니다");
		}
	}
}
