package inner;

public class Outer2Main {
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.button.click();
		
		Button button = outer.method();
		button.click();
	}//main()
}//class
