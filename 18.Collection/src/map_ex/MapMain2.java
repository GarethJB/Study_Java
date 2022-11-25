package map_ex;

import java.util.HashMap;
import java.util.Scanner;

public class MapMain2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map =
			new HashMap<String, Integer>();
		
		map.put("홍길동", 80);
		map.put("심청", 95);
		map.put("박문수", 85);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("누구 성적 확인? ");
		String name = scan.next();
		System.out.println(name + " 의 성적 : " + map.get(name));
		
		
	}//main()
}//class
