package object;

public class RectangleMain {
	public static void main(String[] args) {
		// 5 * 10 인 사각형 객체를 두 개 생성
		// 두 사각형을 같은 사각형으로 출력되게 한다
		
		Rectangle r1 = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(5, 10);
		if(r1.equals(r2)) {
			System.out.println("같은 사각형");
		} else {
			System.out.println("다른 사각형");
		}
	}//main()
}//class
