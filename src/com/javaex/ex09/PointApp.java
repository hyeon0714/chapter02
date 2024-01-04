package com.javaex.ex09;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p=new Point(5, 4);
		
		Point p2=new Point(99,100);
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		
		p.draw();
		p2.draw();
		
		p.draw(false);
		p2.draw(false);
		
		
		
				
	}

}
