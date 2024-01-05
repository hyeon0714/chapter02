package com.javaex.ex14;

public class GoodsApp {
	
	public static void main(String[] args) {
		
			//배열 만들기
		
		Goods[] array=new Goods[5];
		
		Goods camera=new Goods("니콘", 400000);
		Goods computer=new Goods("LG그램",900000);
		Goods cup=new Goods("머그컵", 2000);
		
		
		array[0]=camera;
		array[1]=computer;
		array[2]=cup;
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
		
		System.out.println(array[0].getName());
		System.out.println(camera.getName());
		array[0].showInfo();
		
		int a=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=null) {//null은 주소가 없다는 표현이다==이경우는 주소가 있는경우이다
				array[i].showInfo();
				a=a+1;
			}
			
		}System.out.println("제품의 가짓수:"+a);
		
	}
}
