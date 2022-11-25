package object;

public class Circle {
	String a, b;
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getCircle() {
		return radius;
	}
	
	public int setCircle() {
		return radius;
	}
	
	public boolean equals(Object obj) {
		// 비교대상인 Circle과 비교되어질 Circle의 반지름이 같으면
		// 같은 원이라고 하자
		// if (나의 반지름 == 비교될 파라미터원의 반지름)
		// 호출시 Circle → 받는 파라미터 Object
		// 좁은 범위 → 넓은 범위 : sub → super ▶ upCast
		// int → long : int a;  long b = (long)a;  long c = a;
		// Object : 포유동물, Circle : 늑대
		if (obj instanceof Circle) {
			Circle c = (Circle) obj;
			if(radius == c.radius) {
				return true;
			} else {
				return false;				
			}
			} else {
				return false;
		}
	}
}//class
