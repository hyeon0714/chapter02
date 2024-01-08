package com.javaex.ex17;

public class GoodsCount extends Goods {
	
	int count;
	
	public GoodsCount(String name, int price, int count) {
		super(name, price);
		this.count=count;
	}
	public GoodsCount() {
		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	public void showInfo() {
		System.out.println("제품이름:"+super.getName()+"\t가격:"+super.getPrice()+"\t개수:"+count);
	}
	
}
