package shape;

public class Triangle implements Shapable {
	int bottm, height;
	
	Triangle(int bottom, int height) {
		this.bottm = bottom;
		this.height = height;
	}//Triangle
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return bottm * height / 0.5;
	}//getArea()
}//class
