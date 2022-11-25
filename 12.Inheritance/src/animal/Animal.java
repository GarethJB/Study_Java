package animal;

public class Animal {
	String variety;
	int regNum;
	
	Animal(String variety, int regNum) {
		this.variety = variety;
		this.regNum = regNum;
	}//Animal
	
	void eat() {
		System.out.println("먹는다");
	}//eat()
	
	void sleep() {
		System.out.println("잠을 잔다");
	}//sleep()	
}//class
