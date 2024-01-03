package com.javaex.ex03;

public class GoodsApp {
	
	//인스턴스(객체)
	public static void main(String[] args) {
		
		Goods camera=new Goods();
		Goods computer=new Goods();
		Goods cup=new Goods();
		
		//camera.name="니콘"; //private 캡슐화로 사용 안됨(필드값 보호)
		camera.setName("니콘");//메소드를 이용한 연결=>메소드는 ()안에 입력
		//camera.setName="니콘";=>변수를 이용한 연결==>변수는 = 로 입력
		
		//camera.price=400000; //private 캡슐화로 사용안됨(필드값 보호)
		camera.setPrice(400000);//메소드를 이용한 연결
		
		System.out.println(camera.getName());//g/s(게터/세터)메소드를 이용한 출력
		System.out.println(camera.getPrice());
		
		System.out.println("===========");
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		System.out.println("===========");
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		System.out.println(cup.getName());
		System.out.println(cup.getPrice());
		System.out.println("============");
		
		camera.showInfo();//일반 메소드를 이용한 출력
		computer.showInfo();
		cup.showInfo();
		
	}
}
