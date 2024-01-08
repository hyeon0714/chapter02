package com.javaex.ex16;

public class PointApp {
	
	public static void main(String[] args) {
		Point a=new Point();
		a.setX(3);
		a.setY(4);
		
		
		System.out.println(a.toString());
		a.showInfo();
	
		
		ColorPoint b=new ColorPoint();
		b.setX(3);
		b.setY(4);
		b.setColor("red");
		
		System.out.println(b.toString());
		b.showInfo();
		
		
		ColorPoint c=new ColorPoint("red");
		c.showInfo();
		
		
		ColorPoint d=new ColorPoint(10,10,"blue");
		System.out.println(d.toString());
		d.showInfo();
		
		
		
		Point e=new Point(5,5);
		e.showInfo();
	}
}
