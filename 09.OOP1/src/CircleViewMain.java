import java.util.Scanner;

public class CircleViewMain {
	public static void main(String[] args) {
		Circle[] circles = new Circle[6];
		int i;
		
		//반지름이 5의 배수형태 : 5, 10, 15, 20, 25인 원 객체를 생성해서
		//각 배열변수에 주소를 담는 처리를
		/*
		circles[0] = new Circle(5);
		circles[1] = new Circle(10);
		circles[2] = new Circle(15);
		circles[3] = new Circle(20);
		circles[4] = new Circle(25);
		*/
		/*
		for (i = 0; i < circles.length; i++) {
			circles[i] = new Circle((i + 1) * 5);
		}//for
		System.out.println(circles[0]);
		System.out.println(circles[1]);
		System.out.println(circles[2]);
		System.out.println(circles[3]);
		System.out.println(circles[4]);
		*/
		
		for(int idx = 0; idx<circles.length-1; idx++) {
			circles[idx] = new Circle(5*(idx+1));
		}//for
		System.out.println("----------------");
		System.out.println(" 원 목록");
		System.out.println("----------------");
		
		for(Circle c : circles) {
			if (c == null) continue;
			CircleDAO dao = new CircleDAO(c);
			dao.display();
		}//for
		
		
		for(Circle c : circles) {
			System. out.printf("반지름 %d 인 원",c.getRadius());
		}//for
		System.out.println();
		for(int idx = 0; idx < circles.length; idx++) {
			if(circles[idx] == null) continue;
			System.out.printf("%d. 반지름 %d 인 원\t", idx+1, circles[idx] .getRadius());
		}//for
		System.out.print("\n확인할 원의 번호를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		//circles[no-1]
		if (no <= circles.length) {
			if(circles[no-1] != null) {
				CircleDetailMain detail = new CircleDetailMain();
				detail.displayCircle(circles[no-1]);
			}else  {
				System.out.println("생성된 원이 없습니다");
			}
		}//if
	}//main()
}//class