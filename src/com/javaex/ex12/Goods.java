package com.javaex.ex12;

public class Goods {
	//필드
	private String name;
	private int price;
	static int count;//스태틱 영역에 생성(공통영역에서 누적 가능)
	private int no;
	
	
	

	//생성자
	public Goods() {
		count=count+1;
		no=count;
	}
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
		count=count+1;
		no=count;
	}


	//게터,세터
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



	public int getCount() {
		return count;
	}


	/*
	public void setCount(int count) {
		this.count = count;
	}
	*/
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
	//일반
	
	
}
