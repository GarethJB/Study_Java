package ex;

import java.util.ArrayList;

public class MemberDAO {
	private ArrayList<MemberDTO> list;
	
	MemberDAO(ArrayList<MemberDTO> list){
		//DB에 연결한다-배열에 접근한다
		this.list = list;
	}
	//CRUD
	//회원정보를 저장한다: Create
	void member_insert(MemberDTO dto) {
		//배열에 저장한다
		//화면에서 입력한 정보를 DB(배열)에 저장
		list.add(dto);
	}
	//선택한 회원정보을 조회한다: Read
	MemberDTO member_view(int no) {
		//DB에서 선택한 회원의 정보를 조회해와
		//회워정보화면에 출력할 수 있도록 데이터를 리턴한다
		MemberDTO dto = list.get(no-1);
		return dto;
	}
	//회원정보목록을 조회한다: Read
	ArrayList<MemberDTO> member_list() {
		//DB에서 조회해온 회원목록을 
		//목록화면에 출력할 수 있도록 데이터를 리턴한다
		return list;
	}
	//회원정보를 변경한다: Update
	void member_update(MemberDTO dto) {
		
	}
	//회원정보를 삭제한다: Delete
	void member_remove(MemberDTO dto) {
		list.remove(dto);
	}
}//class
