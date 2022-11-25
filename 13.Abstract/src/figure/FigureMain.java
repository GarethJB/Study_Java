package figure;

public class FigureMain {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 5);
		System.out.println("사각형의 넓이 : " + r1.getArea());
		
		RightTriangle t1 = new RightTriangle(3, 5);
		System.out.println("직각삼각형의 넓이 : " + t1.getArea());
	}//main()
}//class
