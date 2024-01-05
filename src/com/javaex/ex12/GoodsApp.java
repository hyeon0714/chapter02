package com.javaex.ex12;

public class GoodsApp {
	
	/*
	//필드
	
	//생성자
	
	//게터세터
	
	//일반
		
	*/
	
	
	public static void main(String[] args) {
		
		System.out.println(Goods.count);
		
		Goods camera=new Goods("니콘", 400000);
		
		System.out.println(camera.toString());
		
		
		Goods computer=new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup=new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
		System.out.println(Goods.count);
		System.out.println(Goods.class);
		
		System.out.println(camera.getNo());
		
		System.out.println(computer.getNo());
		
		System.out.println(cup.getNo());
		
	}
}
