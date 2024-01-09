package com.javaex.ex20;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle() {
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void draw() {
		System.out.println("----원을 그리세요----");
		System.out.println("면색:"+super.getFillColor());
		System.out.println("살색:"+super.getLineColor());
		System.out.println("반지름:"+radius);
		System.out.println("---------------------");
	}
}
