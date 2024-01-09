package com.javaex.ex19;

public class ShapeApp {
	
	public static void main(String[] args) {
	
		Ractangle[] rArray=new Ractangle[3];
		
		Ractangle a=new Ractangle(5, 10, "파랑", "빨강");
		Ractangle b=new Ractangle(7, 14, "노랑", "초록");
		Ractangle c=new Ractangle(2, 8, "검정", "하양");

		rArray[0]=a;
		rArray[1]=b;
		rArray[2]=c;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		Triangle[] tArray=new Triangle[3]; 
				
		Triangle d=new Triangle(9, 6, "초록", "노랑");
		Triangle e=new Triangle(7, 2, "하양", "검정");
		Triangle f=new Triangle(10, 6, "빨강", "파랑");
		
		tArray[0]=d;
		tArray[1]=e;
		tArray[2]=f;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		Circle[] cArray=new Circle[3];
		
		Circle g=new Circle(6, "파랑", "파랑");
		Circle h=new Circle(7, "빨강", "빨강");
		Circle i=new Circle(8, "보라", "보라");
		
		cArray[0]=g;
		cArray[1]=h;
		cArray[2]=i;
		
		for(int k=0; k<cArray.length; k++) {
			cArray[k].draw();
		}
	}
}
