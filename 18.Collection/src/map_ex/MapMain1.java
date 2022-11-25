package map_ex;

import java.util.HashMap;

public class MapMain1 {
	public static void main(String[] args) {
		HashMap<String, String> map =
				new HashMap<String, String>();
		
		//데이터 저장 → put
		map.put("홍길동", "개발자반");
		map.put("심청", "디자인반");
		map.put("박문수", "회계반");
		
		//데이터 조회 → get
		String _class  = map.get("홍길동");
		System.out.println(_class);
		
		//데이터 삭제 → remove
		map.remove("심청");
		System.out.println(map.get("심청"));
		
		map.put("홍길동", "회계반");
		System.out.println(map.get("홍길동"));
	}//main()
}//class
