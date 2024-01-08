package com.javaex.ex16;

public class ColorPoint extends Point {
	
	//필드
	String color;
	
	//생성자
	public ColorPoint() {
		super();
		System.out.println("color");
	}
	
	public ColorPoint(String color) {
		this.color=color;
		System.out.println("color2");
	}
	
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
		System.out.println("color3");
	}

	//g/s
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	//일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	public void showInfo() {
		
		System.out.println("x="+super.x+", y="+super.getY()+", color="+color);//this 사용보다는 부모 클래스를 부르기 위해 super가 좋다
		//부모 클래스의 필드 접근제어자가 protected 라서 x의 값을 그대로 쓸수 있다
		//y의 값은 private 접근제어자라서 get으로 연결해줘야한다
		System.out.println("------------------");
		System.out.println();
	}
	
}
