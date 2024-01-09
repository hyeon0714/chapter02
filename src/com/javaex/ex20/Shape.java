package com.javaex.ex20;

public class Shape {
	
	//필드
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Shape() {
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor=fillColor;
		this.lineColor=lineColor;
	}
	
	
	//메소드 g/s
	public void setLineColor(String lineColor) {
		this.lineColor=lineColor;
	}
	
	public void setFillColor(String fillcolor) {
		this.fillColor=fillcolor;
	}
	
	public String getLineColor() {
		return lineColor;
	}
	
	public String getFillColor() {
		return fillColor;
	}

	
	//메소드

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	public void draw() {
		System.out.println("-----도형을 그리세요-----");
		System.out.println("면색:"+fillColor);
		System.out.println("선색:"+lineColor);
		System.out.println("-------------------------");
	}
}
