package com.javaex.ex06;

public class Goods {
	
	//필드
	private String name;
	private int price;

	
	//생성자==>생성자는 리턴값이 없다
	//입력하지 않아도 생성자는 자동으로 만들어진다
	//초기화를 시킨다(클래스를 인스턴스화)
	public Goods() {//1번 생성자
	}
	
	public Goods(String name) {//2번 생성자
		//메모리에 올리는 일(클래스를 인스턴스화)
		this.name=name;//추가
		//System.out.println("Goods(name)");
	}
	public Goods(String name, int price) {//3번 생성자
		//this.name=name;
		this(name);//Goods(String name)생성자를 가져온다
		//this()는 생성자에서만 사용한다
		this.price=price;
		System.out.println("Goods(name, price)");
	}
	
	
	
	
	//게터/세터 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
}
