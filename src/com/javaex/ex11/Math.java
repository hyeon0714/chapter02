package com.javaex.ex11;

public class Math {
	
	
	
	
	
	public int plus(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int plus(double a, int b) {
		int sum=(int)a+b;
		return sum;
	}
	public int plus(int a, double b) {
		int sum=a+(int)b;
		return sum;
	}
	public int plus(double a, double b) {
		int sum=(int)a+(int)b;
		return sum;
	}
	
	
	
	public String plus(String a, int b) {
		String sum = a;
		for(int i=1; i<b; i++) {
			sum = sum+a;
		}
		return sum;
	}
}
