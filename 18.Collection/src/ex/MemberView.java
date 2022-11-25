package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberView {
	private Scanner scan;
	private ArrayList<MemberDTO> list;
	
	MemberView(Scanner scan, ArrayList<MemberDTO> list){
		this.scan = scan;
		this.list = list;
	}
	
	void display(int no) {
		//선택한 회원의 정보를 DB(배열)에서 조회해와 화면에 출력
		MemberDAO dao = new MemberDAO(list);
		MemberDTO dto = dao.member_view(no);
		System.out.println("회원정보 -------");
		System.out.println("성명: " + dto.getName() );
		System.out.println("성별: " + dto.getGender() );
		System.out.println("전화번호: " + dto.getPhone() );
		
		System.out.println("1.정보수정  2.정보삭제");
		int button = scan.nextInt();
		if( button == 1 ) {
			//회원수정화면 보기	
			dao.member_update(dto);
			MemberUpdate dt = new MemberUpdate(scan, dto);
		}else if( button == 2 ) {
			//DB(배열)에서 해당 회원정보를 삭제
			dao.member_remove(dto);
			System.out.println("삭제되었습니다.");
		}
		
	}
	
}
