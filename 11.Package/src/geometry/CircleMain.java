package geometry;

public class CircleMain {
	public static void main(String[] args) {
		//반지름 5인 원 생성
		Circle c =  new Circle(5);
		System.out.println("반지름: " + c.radius);
		System.out.println("넓이:" + c.getArea());
	}//main()
}//class
