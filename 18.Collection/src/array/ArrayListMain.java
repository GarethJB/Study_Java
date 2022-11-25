package array;

import java.util.ArrayList;

public class ArrayListMain {
	public static void main(String[] args) {
		//문자열 데이터를 여러 개 저장할 자료구조 ArrayList 생성
		ArrayList<String> list = 
		new ArrayList<String>();
		list.add("가");
		list.add("나");
		list.add("A");
		list.add("홍길동");
		list.add("사과");
		//크기 : size()
		System.out.println("크기 : " + list.size());
		for(int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		
		for(String data : list) {
			System.out.println(data);
		}
		
		//중간위치에 삽입하고자 할 때
		list.add(2,"심청");
		for(String data : list) {
			System.out.println(data);
		}
	}//main()
}//class
