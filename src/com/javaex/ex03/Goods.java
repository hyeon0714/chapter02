package com.javaex.ex03;

public class Goods {
	
	//클래스(틀)
	
	//필드
	private String name;//"니콘","LG그램","머그컵"
	private int price;//400000,900000,2000
	
	//생성자
	//메소드-g/s,일반
	public void setName(String name) {//이름 입력 메소드
		this.name=name;//this는 인스턴스가 생성될때 이름이 붙는다!(name=name 이름이 같아서 헷갈릴때 사용!)
	}
	public void setPrice(int price) {//가격 입력 메소드
		this.price=price;//this는 인스턴스가 생성될때 이름이 붙는다!(price=price 이름이 같아서 헷갈릴때 사용!)
	}
	
	public String getName() {//이름 출력 메소드
		return this.name;
	}
	public int getPrice() {//가격 출력 메소드
		return this.price;
	}
	//메소드 중 get과 set을 사용하는 메소드를 g/s(게터/세터)메소드라고 한다
	
	
	//일반메소드
	public void showInfo() {
		System.out.println("상품명:"+this.name);
		System.out.println("금액:"+this.price);
		System.out.println();
	}
}
