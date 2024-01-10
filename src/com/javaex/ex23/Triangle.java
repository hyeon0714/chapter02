package com.javaex.ex23;

public class Triangle extends Shape implements Drawable {
	
	private int width;
	private int height;
	
	public Triangle() {
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
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
	
	public void draw() {
		System.out.println("----삼각형을 그리세요----");
		System.out.println("면색:"+super.getFillColor());
		System.out.println("선색:"+super.getLineColor());
		System.out.println("가로:"+width);
		System.out.println("세로:"+height);
		System.out.println("-------------------------");
	}
	
	public double area() {
		return width*height*0.5;
	}
}
