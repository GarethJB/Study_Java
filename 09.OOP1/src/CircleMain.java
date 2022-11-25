/*
import java.text.DecimalFormat;

public class CircleMain {
	public static void main(String[] args) {
        final double pie = 3.14;
		
        Circle circle = new Circle();
		int radius = circle.setRadius();
		circle.getLength(radius, pie);
		circle.getArea(radius, pie);
		
		DecimalFormat df1 = new DecimalFormat("##.#");
		DecimalFormat df2 = new DecimalFormat("##");
		System.out.println("반지름 : " + radius);
		System.out.println("원의 둘레 : " + df1.format(circle.getLength(radius, pie)));
		System.out.println("원의 넓이 : " + df2.format(circle.getArea(radius, pie)));
	}//main()
}//class
*/
/*
public class CircleMain { 
	public static void main(String[] args) { 
//	int radius = 5;
//	System.out.println( radius );
		
	CircleDAO dao = new CircleDAO();
	dao.display(c1);
	Circle c1 = new Circle(10);	//생성자 호출문
	dao.display();
	
	Circle c2 = new Circle(5);
	dao.display();
	
	Circle c3 = new Circle(15);
	dao.display();
	}//main()

}//class
*/  




/*
 1. Circle 클래스 선언하기
 - 필드 : 반지름(private)
 - 생성자 : 반지름을 초기화하는 생성자
 - 메소드 : 반지름을 반환하는 메소드
  			원의 둘레를 반환하는 메소드
  			원의 넓이를 반환하는 메소드
  			
 2. CircleMain 클래스 선언하기
 - main 메소드 선언
 	: 반지름이 10인 원 객체를 생성하여
 	  출력 :  반지름 - 10
 	  		  원의 둘레 - 62.8
 	  		  원의 넓이 - 314
  */
 

 
