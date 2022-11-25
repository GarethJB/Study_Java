package animal;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog("진돗개 ");
		dog.sound();
		
		Animal dog2 = new Dog("말티즈 ");
		dog2.sound();
		//상속의 관계가 있을 때 override 되어 있다면
		//override된 메소드가 호출된다
	}//main()
}//class