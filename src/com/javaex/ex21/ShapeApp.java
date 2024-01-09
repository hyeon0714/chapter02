package com.javaex.ex21;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		//섞어쓰기
		
		
		//부모만 보이고, 자식클래스는 사용 못함
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
		//똑같은 이름의 메소드가 있다면 자식의 메소드가 부모의 메소드를 덮어쓴다
		//예시로 이 경우에는 getLineColor와 getFillColor만 사용가능하고 반지름, 가로, 세로는 출력이 안된다
		//draw라는 똑같은 이름의 메소드가 같이 존재하기에 자식의 메소드가 부모의 메소드르 덮어써서 전체가 출력됬다
		//이름이 같은 메소드만 가능한 경우이다
		//오버라이딩!
		//자식 클래스에서 부모클래스 받아서 쓰는 오버라이딩이 반대 경우에도 똑같이 일어난다!
		
		//부모 입잡에서 사용하는 메소드가 없고 자식에게만 메소드가 존재하면 사용이 불가하다!
		
		Circle c99=new Circle("화이트", "블랙", 7);
		c99.draw();
		
		Shape c00=new Circle("블랙", "화이트", 5);
		c00.draw();
		
	}
}
