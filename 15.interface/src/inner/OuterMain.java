package inner;

public class OuterMain {
	public static void main(String[] args) {
		Outer out = new Outer();
		System.out.println(out.field);
		
		Outer.Inner1 inner1 = new Outer().new Inner1();
		System.out.println(inner1.field);
		inner1.method();
		
		Outer.Inner2 inner2 = new Outer.Inner2();
		System.out.println(inner2.field);
		inner2.method();
	}//main()
}//class
