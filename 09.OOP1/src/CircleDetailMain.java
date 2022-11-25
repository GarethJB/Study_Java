public class CircleDetailMain {
	void displayCircle(Circle c) {
		System.out.println("원 정보 상세 화면");
		CircleDAO dao = new CircleDAO(c);
		dao.display();
	}//displayCircle
}//class


