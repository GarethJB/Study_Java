package ex03;

import java.util.Scanner;

import employee.EmployeeDAO;
import employee.EmployeeDTO;

public class EmployeeInfo {
	private Scanner sc;
	public EmployeeInfo(Scanner sc) {
		this.sc = sc;
	}
	public void display(int employee_id) {
		System.out.println("사원정보화면 ---------------");
		//DB에서 해당 사원정보를 조회해와
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO dto = dao.employee_info(employee_id);
		//화면에 출력한다
		if( dto==null ) {
			System.out.println("사원정보가 없습니다");
		}else {
			System.out.printf( "사번[%d] 사원정보 \n", employee_id );
			System.out.println("사번: " + dto.getEmployee_id() );
			System.out.println("성명: " + dto.getName() );
			System.out.println("이메일: " + dto.getEmail() );
			System.out.println("전화번호: " + dto.getPhone_number() );
			System.out.println("부서: " + dto.getDepartment_name() );
			System.out.println("업무: " + dto.getJob_title() );
			System.out.println("급여: " + dto.getSalary() );
			System.out.println("입사일자: " + dto.getHire_date() );
//			System.out.println("매니저: " + dto.getManager_name() );
		}
		System.out.println("-----------------------\n");
		System.out.println("1.목록으로  0.종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		if( menu==1 ) {
			EmployeeList list = new EmployeeList(sc);
			list.display();
		}else {
			System.exit(0);
		}
	}
}
