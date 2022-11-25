package math;

import geometry.polygon.Rectangle;

// import 선언문 단축키 : ctrl + shift + o


// 접근제한자(접근제어자)
// default : 같은 package 내에서만 접근 가능
// 서로 다른 package에 있는 클래스의 
// 구성요소(멤버변수(인스턴스변수):필요, 생성자, 메소드) 에
// 접근하려면 public 으로 접근허용 해야한다


public class RectangleMain {
	public static void main(String[] args) {
		// 10 * 5 인 사각형
		Rectangle r1 = new Rectangle(10, 5);
		System.out.printf("%d * %d 인 사각형 \n",r1.width, r1.height);
		System.out.printf("넓이 : %d ", r1.getArea());
	}//main()
}//class
