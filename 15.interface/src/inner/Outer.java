package inner;

public class Outer {
	int field = 10;
	Outer() {
		System.out.println("Outer 클래스의 생성자");
	}
	void method() {
		System.out.println("Outer 클래스의 메소드");
	}
	
	class Inner1{
		int field = 20;
		Inner1() {
			System.out.println("Outer 클래스의 멤버인 Inner1의 생성자");
		}
		void method() {
			System.out.println("Outer 클래스의 멤버인 Inner1의 메소드");
		}
		
	}//Inner1 class
	static class Inner2{
		int field = 30;
		Inner2() {
			System.out.println("Outer 클래스의 멤버인 Inner2의 생성자");
		}
		void method() {
			System.out.println("Outer 클래스의 멤버인 Inner2의 메소드");
		}
		
	}
}//class
