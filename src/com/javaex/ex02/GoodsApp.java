package com.javaex.ex02;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		//new Goods라는 툴은 Goods라는 클래스에 있다
		
		Goods camera=new Goods();
		camera.name="nikon";
		camera.price=400000;
		
		Goods computer=new Goods();
		computer.name="LG그램";
		computer.price=900000;
		
		Goods cup=new Goods();
		cup.name="머그컵";
		cup.price=2000;
		//camera와 coumputer, cup은 저장공간이 다르다
		
		System.out.println("상품이름:"+camera.name+" \t가격:"+camera.price);
		System.out.println("상품이름:"+computer.name+"\t가격:"+computer.price);
		System.out.println("상품이름:"+cup.name+"\t가격:"+cup.price);
		
		
	}
}
