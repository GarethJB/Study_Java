package person;

abstract public class Person {
//	이름, 나이
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}//Person
	
//	먹는다, 잠을잔다, 간다
	void eat() {
		System.out.println(name + "먹는다");
	}//eat()
	void sleep() {
		System.out.println(name + "잠을 잔다");
	}//sleep()
	abstract void go();
}//class
