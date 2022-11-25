package animal;

public class Dog extends Animal{
	Dog(String kind) {
		super(kind);
//		this.kind= kind;
	}
	void sound() {
		System.out.println(kind + "멍멍");
	}//sound()
}//class
