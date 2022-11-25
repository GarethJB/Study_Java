package wrapper;

public class WrapperMain {
	public static void main(String[] args) {
		
		int sum = 0;
		for(String data : args) {
			//String → int ▶ Integer.parseInt(), Integer.valueOf
			sum += Integer.parseInt(data);
			System.out.println(data);
		}
		System.out.println("합 : " + sum);
		
		System.exit(0);
		
		String no1 = "10";
		String no2 = "20";
		//String → int
		//프리미티브 타입을 래퍼런스타입으로 변환 : Wrapper 클래스
		//byte : Byte
		//short : Short
		//long : Long
		//float : Float
		//double : Double
		//int : Integer
		//char : Character
		//boolean : Boolean
		
		System.out.println(no1 + no2);
		
		int no = 10;
		Integer no3 = new Integer(no);
		System.out.println(no3);
		System.out.println("-------------");
		
		// no1 : String → Integer
		// Integer 와 같은 Wraaper 클래스가 
		// 문자열을 숫자로 변환하는 기능(메소드)을 갖고 있다
		Integer s1 = Integer.valueOf(no1);
		System.out.println("s1 : " + s1);
		int s2 = Integer.valueOf(no2);
		System.out.println("s2 : " + s2);
		
		//Integer 타입과 int 타입과의 산술연산 → 가능
		int s3 = s1 + s2;	// Integer + int → int
		// Integer → int 변환 : Auto unBoxing
		// int → Integer 변환 : Boxing
		System.out.println(s3);
		
		
		
	}//main()
}//class
