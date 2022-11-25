
/*
public class Circle {
	private int radius;
	  public int setRadius() { 
		  radius = 10;
		  return radius;
	}//setRadius

    public double getLength(double radius, double pie) {
    	double getLength = radius * 2 * pie;
        return getLength;
    }//getLength
    
    public double getArea(double radius, double pie) {
    	double getArea = pie * radius * radius;
    	return getArea;
    }//getArea
}//class
*/

// private < default < protected < public 
public class Circle { 
	private int radius;			// 생성자 : 반지름을 초기화하는 생성자 
	Circle(int radius) {		// Circle(int radius) {this.radius = radius;}
		this.radius = radius;
	}
	
	int getRadius() {
		return radius;
		//리턴데이터의 데이터타입을 메소드의 리턴타입으로 결정
	}//getRadius - 반지름을 반환하는 메소드
	
	double getAround() {
		double resultAround = 2 * 3.14 * radius;
		return resultAround;
	}//getAround
	
	double getArea() {
		double resultArea = 3.14 * radius * radius;
		return resultArea;
	}//getArea
	
	void display(Circle c1) {
		System.out.printf("반지름 : %d --------------- \n", getRadius());
		System.out.printf("원의 넓이 : %.1f \n", getAround());
		System.out.printf("원의 넓이 : %.1f \n", getArea());
		System.out.println("------------------------");
	}//display
}//class
 