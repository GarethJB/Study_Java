package geometry.polygon;

public class Rectangle {
	public int width, height;
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}//Rectangle() ▶ 초기화 생성자
	
	public int getArea() {
		return width * height;
	}//getArea()
}//class
