package shape;

public class ShapeMain {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Square s = new Square(5);
		Triangle t = new Triangle(5,5);
		
		System.out.println("원의 넓이 : " + c.getArea());
		System.out.println("정사각형의 넓이 : " + s.getArea());
		System.out.println("삼각형의 넓이 : " + t.getArea());
		
	}//main()
}//class
