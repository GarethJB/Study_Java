package animal;

public class Bird extends Animal{
	int wingLength;
	
	Bird(String variety,int regNum, int wingLength) {
		super(variety, regNum);
		this.wingLength = wingLength;
	}//Bird
	
	void fly() {
		System.out.println("하늘은 난다");
	}//fly()
}//class
