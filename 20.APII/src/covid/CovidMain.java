package covid;

import common.PublicAPI;

public class CovidMain {
	public static void main(String[] args) {
		PublicAPI api = new PublicAPI();
		HospitalList list = new HospitalList(api);	//병원목록화면 생성
		PreventList list1 = new PreventList(api);
		//목록화면 보기
//		list.display();
		list1.display();
		
		
		
	}//main()
}//class
