package ex;

import java.util.Scanner;

public class MemberUpdate {
	Scanner scan;
	MemberDTO dto;
	
	MemberUpdate(Scanner scan, MemberDTO dto) {
		this.scan = scan;
		this.dto = dto;
	}
	
	void update() {
		System.out.println("이름 : " );
		dto.setName(scan.nextLine());
		System.out.println("성별 : " );
		dto.setGender(scan.nextLine());
		System.out.println("전화번호 : " );
		dto.setPhone(scan.nextLine());
	}
}
