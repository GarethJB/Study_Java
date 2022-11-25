package view;

import java.util.ArrayList;
import java.util.Scanner;

import employee.DepartmentDAO;
import employee.DepartmentDTO;

public class DepartmentList {
	private Scanner sc;
	public DepartmentList( Scanner sc ){
		this.sc = sc;
	}
	
	public void display() {
		
		DepartmentDAO dao = new DepartmentDAO();
		ArrayList<DepartmentDTO> dlist = dao.department_list();
		
		System.out.println("\t[ 부서목록 ]");
		System.out.println(
			"부서번호\t\t부서명");
		for(DepartmentDTO ddto : dlist) {
			System.out.print(ddto.getDepartment_id() + "\t\t\t");
			System.out.printf("%-20s\n",ddto.getDepartmentname());
		}		
		
		System.out.println("1.홈화면   2.부서정보  0.종료");
		System.out.print("선택: ");
		switch( sc.nextInt() ) {
		case 1:
			View.home.display();
			break;
		case 2:
			System.out.print("조회할 사원번호: ");
			int employee_id = sc.nextInt();
			View.d_info.display(employee_id);
			break;
		default:
			System.exit(0);
		}
	}
	
}
