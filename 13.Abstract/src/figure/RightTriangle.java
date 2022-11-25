package figure;

public class RightTriangle extends Figure{
	int baseLine;
	
	RightTriangle(int height, int baseLine) {
		super(height);
		this.baseLine = baseLine;
	}//RightTriangle
	
	int getArea() {
		return (height * baseLine) / 2;
	}//getArea()
}//class
