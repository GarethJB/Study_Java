package person;

public class Student extends Person{
	String studentNo;
	
	Student(String name, int age,String studentNo) {
		super(name, age);	//슈퍼클래스
		this.studentNo = studentNo;
	}//Student
	
	void go() {
		System.out.println(name + "학교에 간다");
	}//void()
}//class
