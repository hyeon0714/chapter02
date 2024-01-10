package com.javaex.ex22;

public class ShapeApp {
	
	public static void main(String[] args) {
		

		Shape r01=new Ractangle("레드", "레드", 20, 20);//사각형
		
		Shape t01=new Triangle("노랑", "노랑", 10, 15);//삼각형
		
		Shape c01=new Circle("화이트", "화이트", 5);//원
		
		r01.draw();
		
		Shape[] s01=new Shape[3];
		
		s01[0]=r01;
		s01[1]=t01;
		s01[2]=c01;
		
		for(int i=0; i<s01.length; i++) {
			s01[i].draw();
		}

		
		Circle c99=new Circle("화이트", "블랙", 7);
		c99.draw();
		
		Shape c00=new Circle("블랙", "화이트", 5);
		c00.draw();
		
		

		System.out.println();
		System.out.println();
		System.out.println(((Ractangle)s01[0]).getWidth());
		((Circle)s01[2]).setRadius(100);
		((Ractangle)s01[0]).setWidth(5);
		System.out.println(((Circle)s01[2]).getRadius());
		
		for(int i=0; i<s01.length; i++) {
			System.out.println(s01[i].area());
		}
	}
}
