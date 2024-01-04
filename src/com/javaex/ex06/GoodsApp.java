package com.javaex.ex06;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods camera=new Goods();//첫번째 생성자
		camera.setName("니콘");
		camera.setPrice(400000);
						
		System.out.println(camera.toString());
		
		Goods computer=new Goods("LG 그램");//두번째 생성자
		//computer.setPrice(900000);
		//=>생성자에 name만 입력해서 price도 입력을 원하면 따로 입력해줘야한다
		System.out.println(computer.toString());
		
		/*세터 메소드로 생성자의 값을 수정 가능
		computer.setName("그램");
		System.out.println(computer.toString());
		*/
		
		Goods cup=new Goods("머그컵", 2000);//3번째 생성자
		System.out.println(cup.toString());
		
	}
}
