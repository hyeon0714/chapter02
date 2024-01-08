package com.javaex.ex15;

public class Student extends Person {//상속을 받기 위한 문법 (extends + 상속받아올 클래스명)
	
	
	//필드
	private String schoolName;
	
	
	//생성자
	public Student() {
		//부모 클래스의 기본 생성자를 가져온다(부모 클래스에 기본 생성자가 없는경우 에러 발생
		
		//public Person()==>이라는 생성자가 연결되어 있다
		//super(); 잇으나 없으나 자동 연결
		System.out.println("student");//생성자의 연결 확인
	}
	
	public Student(String schoolName) {
		this.schoolName=schoolName;
		System.out.println("student2");
	}
	
	public Student(String name, int age, String schoolName) {
		//필드는 1개이지만 Person 클래스에서 상속받아와서 name과 age가 적용된다
		//부모의 생성자를 호출
		super (name, age);
		/*
		super();
		super.setName(name);
		super.setAge(age);
		*/     //=>연결된 생성자가 바로 없는경우
		
		//super 문법은 부모 클래스의 생성자를 부른다(this()가 아님+private은 사용불가)
		//본인 생성자는 필드값 문제가 없음
		this.schoolName=schoolName;
		System.out.println("student3");
	}
	
	//g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	//일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("이름:"+this.getName()+" 나이:"+this.getAge()+" 학교:"+schoolName);
	}//부모 클래스의 필드가 private로 보호되어 있으니 게터 메소드로 값을 가져온다
	//게터 메소드는 public
	
}
