package geometry.polygon;

public class Square {
	// 한 변의 길이
	public int sideLength;
	
	public Square(int sideLength) {
		this.sideLength = sideLength;
	}//square()
	
	public int getArea() {
		return  sideLength * sideLength;
	}//getArea()
}//class
