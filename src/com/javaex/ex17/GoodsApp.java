package com.javaex.ex17;

import java.util.Scanner;

public class GoodsApp {
	

	public static void main(String[] args) {
		
		GoodsCount[] a=new GoodsCount[3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("품명, 가격, 재고를 입력해주세요");
		for(int i=0; i<a.length; i++) {
			a[i]=new GoodsCount();
			System.out.print("품명:");
			String name=sc.next();
			a[i].setName(name);
			System.out.print("가격:");
			int price=sc.nextInt();
			a[i].setPrice(price);
			System.out.print("재고");
			int count=sc.nextInt();
			a[i].setCount(count);
		}
		
		sc.close();
		for(int i=0; i<a.length; i++) {
			a[i].showInfo();
		}
	}
}
