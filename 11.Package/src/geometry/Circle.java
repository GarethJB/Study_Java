package geometry;

public class Circle {
//hrd.go.kr
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}//class
