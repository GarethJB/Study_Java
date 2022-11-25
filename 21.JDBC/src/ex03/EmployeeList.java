package ex03;

import java.util.ArrayList;
import java.util.Scanner;

import employee.EmployeeDAO;
import employee.EmployeeDTO;

//사원목록화면
public class EmployeeList {
	private Scanner sc;
	public EmployeeList(Scanner sc) {
		this.sc = sc;
	}
	public void display() {
		System.out.println("--------------------");
		System.out.println("사번 \t 성명 \t 부서명");
		System.out.println("--------------------");
		
		//DB에서 사원목록 정보를 조회해와
		//목록화면에 출력
		EmployeeDAO dao = new EmployeeDAO();
		ArrayList<EmployeeDTO> list = dao.employee_list();
		for(EmployeeDTO dto : list) {
			System.out.print( dto.getEmployee_id() + "\t");
			System.out.print( dto.getName() + "\t");
			System.out.println( dto.getDepartment_name() );
		}
		System.out.println("--------------------------------\n");
		System.out.println("1.홈으로  2.사원정보화면  0.종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		switch( menu ) {
		case 1:
			new EmployeeHome(sc);
			break;
		case 2:
			System.out.print("사번: ");
			int employee_id = sc.nextInt();
			EmployeeInfo info = new EmployeeInfo(sc);
			info.display(employee_id);
			break;
		default:
		}
	}
}
