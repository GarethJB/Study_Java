package animal;

public class Dog extends Animal{
	int tailLength;
	
	Dog(String variety, int regNum, int tailLength) {
		super(variety, regNum);
		this.tailLength = tailLength;
	}//Bird
	
	void run() {
		System.out.println("땅위를 달린다");
	}//run()
}//class
