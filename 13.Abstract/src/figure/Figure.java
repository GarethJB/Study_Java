package figure;

abstract public class Figure {
	int height;
	
	Figure(int height) {
		this.height = height;
	}//Figure
	
	abstract int getArea();
}//class
