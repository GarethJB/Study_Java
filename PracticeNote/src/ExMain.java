public class ExMain {
	public static void main(String[] args) {
		System.out.print("1.출력하기");
		System.out.println("2.출력하기");
		String name = "홍길동";
		int score = 90;
		char gender = '남';
		System.out.println(name+"("+ gender +")의 성적 : " + score);
		System.out.printf("%s(%c)의 성적 : %d", name, gender, score);
				
		
		
	}//main()
}//class
