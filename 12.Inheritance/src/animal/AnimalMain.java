package animal;

public class AnimalMain {
	public static void main(String[] args) {
		
		Dog d1 = new Dog("비숑", 4, 5);
		
		d1.eat();
		d1.sleep();
		d1.run();
		
		Bird b1 = new Bird("앵무새", 2, 3);
		
		b1.eat();
		b1.sleep();
		b1.fly();
		
	}//main()
}//class
