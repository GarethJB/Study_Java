package person;

public class Worker extends Person {
	String workerNo;
	
	Worker(String name, int age,String workerNo) {
		super(name, age);	//슈퍼클래스
		this.workerNo = workerNo;
	}//Student
	
	void go() {
		System.out.println(name + "회사에 간다");
	}//go()
}//class
