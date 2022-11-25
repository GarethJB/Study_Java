package ex02;

import java.util.Scanner;

import employee.EmployeeDAO;
import employee.EmployeeDTO;

public class EmployeeInfo {
	public static void main(String[] args) {
		//특정 사번의 사원정보를 출력하는 사원정보화면
		Scanner sc = new Scanner(System.in);
		System.out.print("사번: ");
		int employee_id = sc.nextInt();
		
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO dto = dao.employee_info(employee_id);
		if( dto != null ) {
			System.out.printf( "사번[%d] 사원정보 \n", employee_id );
			System.out.println("사번: " + dto.getEmployee_id() );
			System.out.println("성명: " + dto.getName() );
			System.out.println("이메일: " + dto.getEmail() );
			System.out.println("전화번호: " + dto.getPhone_number() );
			System.out.println("부서: " + dto.getDepartment_name() );
			System.out.println("업무: " + dto.getJob_title() );
			System.out.println("급여: " + dto.getSalary() );
			System.out.println("입사일자: " + dto.getHire_date() );
			System.out.println("매니저: " + dto.getManager_name() );
		}else {
			System.out.printf( "사번[%d] 사원정보는 없습니다. \n", employee_id );
		}
		sc.close();
	}
}
