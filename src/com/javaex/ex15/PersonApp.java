package com.javaex.ex15;

public class PersonApp {
	
	public static void main(String[] args) {
		
		Person a=new Person("정우성", 45); 
		
		System.out.println(a.toString());
		a.showInfo();
	
		Student b=new Student();
		
		b.setSchoolName("한국대학교");
		b.setName("유재석");
		b.setAge(33);
		System.out.println(b.toString());
		
		b.showInfo();//부모 클래스와 상속 클래스에 동일한 이름의 메소드가 있다면 본인의 클래스에서 사용한다
		//같은 이유로 만드는 이유는 부모의 부모의 메소드를 자식이 이용할 경우 오류가 생길수 있으므로
		
		
		Student c=new Student("이효리", 22, "서울대학교");
		
		c.showInfo();
		
	}
}
