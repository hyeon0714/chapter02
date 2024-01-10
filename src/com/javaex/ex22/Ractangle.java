package com.javaex.ex22;

public class Ractangle extends Shape {
	
	private int width;
	private int height;
	
	public Ractangle() {
	}
	
	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width=width;
		this.height=height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	public void draw() {
		System.out.println("-----사각형을 그리세요-----");
		System.out.println("면색:"+super.getFillColor());
		System.out.println("선색:"+super.getLineColor());
		System.out.println("가로:"+width);
		System.out.println("세로:"+height);
		System.out.println("---------------------------");
	}
	
	public double area() {
		return width*height;
	}//자식 클래스에서는 abstract를 써줄 필요가 없다
	
}
