package com.javaex.ex22;

public abstract class Shape {//abstract 클래스의 추상화
	
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
	
	
	public abstract double area();
	//abstract 클래스의 추상화
	//abstract 클래스는 가상의 클래스이므로 혼자서는 쓸수가 없다
	//자식클래스에서는 abstract가 들어간 메소드를 반드시 만들어야한다
	
}
