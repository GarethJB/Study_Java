package string;

public class StringMain {
	public static void main(String[] args) {
		String str1 = "자바";	//a03
		String str2 = "자바" + "2" + "1" + "a" + "B";
		
		//자바 라는 문자열데이터의 존재 주소를 참조
		if(str1 == str2) System.out.println("같은 인스턴스");
		else System.out.println("다른 인스턴스");
		
		String str3 = new String("자바");	//a01
		String str4 = new String("자바");	//a02
		//문자열이 같은 값인지 비교 : equals
		int no1 = 10, no2 = 10;
		if(no1 == no2) System.out.println("같은 숫자 값");
		else System.out.println("다른 숫자 값");
		
		if(str3 == str4) System.out.println("같은 인스턴스");
		else System.out.println("다른 인스턴스");
		
		if(str3.equals(str4))
			System.out.println("같은 문자열");
		else
			System.out.println("다른 문자열");
		
	}//main()
}//class
