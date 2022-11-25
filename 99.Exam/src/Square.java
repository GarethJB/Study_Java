public class Square {
	int width;
	int height;
	
	Square(int width, int height) throws Exception {
		if (width < 0 || height < 0) {
			throw new Exception("사각형을 생성할 수 없습니다.");
		}//if
		this.width = width;
		this.height = height;
	}//Square
	
	int getRound() {
		return (width * 2) + (height * 2);
	}//getRound()
	
	int getArea() {
		return width * height;
	}//getArea()
}//class
