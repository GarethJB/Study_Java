package object;

public class CircleMain {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		if(c1.equals(c2)) 
			System.out.println("같은 원");
		else System.out.println("다른 원");
	}
}
