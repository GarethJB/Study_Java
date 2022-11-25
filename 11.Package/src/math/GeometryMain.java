package math;

import geometry.Circle;
import geometry.polygon.Rectangle;


public class GeometryMain {
	// 반지름 5인 원
	// 4 * 5 인 사각형 
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(4, 5);
		
		if(c.getArea() >= r.getArea()) {
			System.out.println("원의 넓이가 더 넓다");
		}else {
			System.out.println("사각형의 넓이가 더 넓다");
		}
		
	}//main()
	
}//class
