package inner;

public class Outer2 {
	//익명 클래스는 반드시 선언은 ; 으로 끝낸다
	Button button = new Button() {
		void click() {
			System.out.println("버튼클래스 클릭");
		}
	};
	
	Button method() {
		/*
		 * Button no = new Button() { void click() {
		 * System.out.println("익명클래스의 클릭 메소드"); } };
		 */
		return new Button() {
			void click() {
				System.out.println("익명클래스의 클릭 메소드");
			}
		};
	}
}//class
