package view;

import java.util.Scanner;

import employee.DepartmentDAO;
import employee.DepartmentDTO;

public class DepartmentInfo {
	private Scanner sc;
	public DepartmentInfo( Scanner sc ){
		this.sc = sc;
	}
	
	public void display(int employee_id) {
		DepartmentDAO ddao = new DepartmentDAO();
		DepartmentDTO ddto = ddao.department_info(employee_id);
		
		System.out.println("\t[ 부서정보 ]");
		if( ddto == null ) {
			System.out.println("부서정보가 없습니다");
		}else {
			System.out.printf("%-15s: %d\n",
							"부서번호", ddto.getDepartment_id());
			System.out.printf("%-15s: %-15s\n",
							"부서명", ddto.getDepartmentname());
			System.out.printf("%-15s: %s\n",
							"담당매니저", ddto.getManager_name());
			System.out.printf("%-15s: %-15d\n",
							"도시", ddto.getCity());
		}
		
		System.out.println("1.홈화면  2.부서목록  0.종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		if( menu==1 ) {
			View.home.display();
		}else if( menu==2 ) {
			View.d_list.display();
		}else if( menu==0 ) {
			System.exit(0);
		}
	}
	
}
