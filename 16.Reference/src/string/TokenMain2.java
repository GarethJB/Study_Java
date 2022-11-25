package string;

import java.util.StringTokenizer;

public class TokenMain2 {
	public static void main(String[] args) {
		//문자열 "사과 = 5, 배 = 30, 귤 = 20
		//토큰을 분리해 다음처럼 출력한다 : StringTokenizer
		//사과 = 5
		//배 = 30
		//귤 = 20
		String s = "사과 = 5, 배 = 30, 귤 = 20";
		StringTokenizer t = new StringTokenizer(s, ",");
		
		System.out.println(s);
		System.out.println(t.countTokens());
		int count = t.countTokens();
		for (int i = 0; i < count; i++) {
			System.out.println(t.nextToken());
		}
		
	}//main()
}//class
