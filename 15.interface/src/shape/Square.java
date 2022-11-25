package shape;

public class Square implements Shapable {
	 int sideLength;
	 
	 Square(int sideLength) {
		 this.sideLength = sideLength;
	 }//Squre
	 
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return sideLength * sideLength;
	}//getArea()
}//class
