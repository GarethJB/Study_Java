package shape;

public class Circle implements Shapable{
	int radius;

	Circle (int radius) {
		this.radius = radius;
	}//Circle
	
	public double getArea() {
		//return 3.14 * radius * radius;
		return 3.14 * Math.pow(radius, 2);
	}//getArea()
}//class
