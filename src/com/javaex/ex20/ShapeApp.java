package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle[] r01=new Ractangle[2];
		
		Ractangle a=new Ractangle("갈색", "갈색", 5, 3);
		Ractangle b=new Ractangle("살구색", "살구색", 8, 10);
		
		r01[0]=a;
		r01[1]=b;
		
		for(int i=0; i<r01.length; i++) {
			r01[i].draw();
		}
		
		Ractangle r02=new Ractangle();
		r02.setFillColor("그레이");
		r02.setLineColor("레드");
		r02.setWidth(13);
		r02.setHeight(11);
		
		r02.draw();
		
		Shape s01=new Shape();
		s01.setFillColor("화이트");
		s01.setLineColor("블랙");
		
		s01.draw();
		
		Triangle t01=new Triangle();
		
		t01.setFillColor("보라");
		t01.setLineColor("검정");
		t01.setWidth(6);
		t01.setHeight(7);
		
		t01.draw();
		
		Triangle[] t02=new Triangle[2];
		
		Triangle tt=new Triangle("초록", "파랑", 5, 4);
		Triangle ttt=new Triangle("파랑", "초록", 4, 5);
		
		t02[0]=tt;
		t02[1]=ttt;
		
		for(int i=0; i<t02.length; i++) {
			t02[i].draw();
		}
		
		Circle c01=new Circle();
		c01.setFillColor("주황색");
		c01.setLineColor("백색");
		c01.setRadius(3);
		
		c01.draw();
		
		Circle[] c02=new Circle[2];
		
		Circle cc=new Circle("블루", "레드", 4);
		Circle ccc=new Circle("레드", "블루", 7);
		c02[0]=cc;
		c02[1]=ccc;
		
		for(int i=0; i<c02.length; i++) {
			c02[i].draw();
		}

	}
}
