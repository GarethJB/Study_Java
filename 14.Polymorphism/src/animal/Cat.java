package animal;

public class Cat extends Animal{
	Cat(String kind) {
		super(kind);
//		this.kind = kind;
	}
	void sound() {
		System.out.println(kind + "야옹");
	}//sound()
}//class
