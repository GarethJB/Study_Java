package geometry.polygon;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 5);
		System.out.printf("사각형 : %d * %d \n", r1.width, r1.height);
		System.out.printf("넓이 : %d", r1.getArea());
		
	}//main()
}//class
