package com.javaex.ex19;

public class Circle {
	
	//필드
	private int radius;
	private String lineColor;
	private String fillColor;

	
	//생성자
	public Circle() {
	}
	
	public Circle(int radius, String lineColor, String fillColor) {
		//super();
		this.radius = radius;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	//메소드 g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	//메소드 일반
	public void draw() {
		System.out.println("----원을 그리세요-----");
		System.out.println("반지름:"+radius);
		System.out.println("선색:"+lineColor);
		System.out.println("면색:"+fillColor);
		System.out.println("----------------------");
	}
}
