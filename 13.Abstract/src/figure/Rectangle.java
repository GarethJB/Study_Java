package figure;

public class Rectangle extends Figure{
	int width;
	
	Rectangle(int height, int width) {
		super(height);
		this.width = width;
	}//Rectangle
	
	int getArea() {
		return height * width;
	}//getArea()
}//class
