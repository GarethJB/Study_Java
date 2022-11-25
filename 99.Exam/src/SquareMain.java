public class SquareMain {
	public static void main(String[] args) {
		
		try {
			Square s1 = new Square(5, 10);
			System.out.println("둘레 : " + s1.getRound());
			System.out.println("넓이 : " + s1.getArea());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Square s2 = new Square(-5, 10);			
			System.out.println("둘레 : " + s2.getRound());
			System.out.println("넓이 : " + s2.getArea());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}//main()
}//class
