package object;

public class Rectangle {
	// 필드 : 너비, 높이 - private
	// 생성자 선언 - public
	// getter, setter 메소드
	
	private int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;		
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			if(width == r.width && height == r.height) {
				return true;				
			} else {
				return false;
			}
		} else {
			return false;			
		}
	}
}
