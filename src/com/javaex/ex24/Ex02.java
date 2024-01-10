package com.javaex.ex24;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int[] a=new int[3];
		
		a[0]=3;
		a[1]=6;
		a[2]=9;
		
		try {
			for(int i=0; i<=a.length; i++) {
				System.out.println( a[i]);
			}	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println("배열의 범위를 벗어나 종료");
		}finally {//생략가능
			
		}
		
		
		
		
	}
}
