package string;

import java.util.StringTokenizer;

public class TokenMain {
	public static void main(String[] args) {
		String fruits = "사과,배,귤/감";
		//문자열에서 토큰단위로 문자열을 분리하는 기능을 가진 클래스
		//: StringTokenizer
		//생성자 파라미터로 토큰분리 대상인 문자열, 구분자를 지정한다
		//구분자 지정하지 않으면 공백문자
		//구분자를 여러개 지정 가능 "/,"
		StringTokenizer token = new StringTokenizer(fruits, "/,");
		//토큰 분리 메소드 : nextToken()
		
		while(token.hasMoreTokens()) {
			String data = token.nextToken();
			System.out.println(data);			
		}
		
		System.out.println(fruits);
		//토큰의 갯수를 반환하는 메소드 : countTokens
		token
		= new StringTokenizer(fruits, "/,");
		System.out.println(token.countTokens());
		int count = token.countTokens();
		for(int i = 0; i < count; i++) {
			System.out.println(token.nextToken());
		}
		
		
	}//main()
}//class
