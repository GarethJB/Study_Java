package ex;

//부모클래스에서 상속(extends) 받는다
//Person : 부모클래스, 상위클래스, super클래스
//Student : 자식클래스, 하위클래스, sub클래스

public class Student extends Person{
	// 학생명, 나이, 학번:001265
	String studentNo;
	
	// 학교에 간다
	void gotoSchool() {
		System.out.println(name + "학교를 간다");
	}//gotoSchool()
}//class
