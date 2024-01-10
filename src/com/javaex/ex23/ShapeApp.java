package com.javaex.ex23;

public class ShapeApp {
	
	public static void main(String[] args) {
		

		Ractangle r01=new Ractangle("레드", "레드", 20, 20);//사각형
		
		Triangle t01=new Triangle("노랑", "노랑", 10, 15);//삼각형
		
		Circle c01=new Circle("화이트", "화이트", 5);//원
		
		Drawable p01=new Point(2,2);
		
		/*
		부모 클래스에는 draw가 없기에 상속받을때처럼 시작을 Shape로 시작하면
		Drawalbe 인터페이스에 담을수가 없다
		   Shape s04=new Ractangle("블랙", "블랙", 1, 1);
		   Drawalbe d04=s04 =====표현이 불가능
		*/
		
		//그릴수 있는 걸 표현
		System.out.println("그릴수 잇는걸 표현");
		Drawable[] d01=new Drawable[4];
		d01[0]=r01;
		d01[1]=t01;
		d01[2]=c01;
		d01[3]=p01;
		
		System.out.println(((Ractangle)d01[0]).getWidth());
		
		
		for(int i=0; i<d01.length; i++) {
			d01[i].draw();
		}
		
		for(int i=0; i<d01.length; i++) {
			if(d01[i] instanceof Shape) {
				//현재 배열의 주소를 따라가면 Shape가 있냐
				System.out.println(((Shape)d01[i]).area());
				//Point가 Shape의 면적 구하기가 안됨으로 if문으로 면적 구하기 실행
				//Shape로 이루어진게 있으면 출력하기임
			}
			
		}
		
		//면적을 구하는걸 표현
		System.out.println("================");
		System.out.println("면적을 구하는걸 표현");
		Shape[] s01=new Shape[3];
		s01[0]=r01;
		s01[1]=t01;
		s01[2]=c01;
		
		for(int i=0; i<s01.length; i++) {
			System.out.println(s01[i].area());
		}
		
		for(int i=0; i<s01.length; i++) {
			((Drawable)s01[i]).draw();
		}
		//인터페이스의 활용법
		//부모 클래스는 자신의 필드를 가져서 상속가능
		//인터페이스는 추상적인 메소드만을 가져서 필드나 생성자의 상속이 불가능(해당 추상 메소드만을 출력 가능)
		
	}
}
