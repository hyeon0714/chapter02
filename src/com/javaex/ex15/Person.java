package com.javaex.ex15;

public class Person {
	
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {
		System.out.println("person");
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("pesrson2");
	}
	
	//G/S
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	//일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: "+name+" 나이: "+age);
	}
	
}
