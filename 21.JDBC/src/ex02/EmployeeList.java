package ex02;

import java.util.ArrayList;

import employee.EmployeeDAO;
import employee.EmployeeDTO;

//사원목록화면
public class EmployeeList {
	public static void main(String[] args) {
		//DB에서 사원목록정보를 조회해와 
		//사원목록화면에 출력한다
		
		//DB연결된 처리를 할 클래스: DAO(DataAccessObject)
		EmployeeDAO dao = new EmployeeDAO();
		ArrayList<EmployeeDTO> list = dao.employee_list();
		System.out.println("----------------------------");
		System.out.println(
		"사번 \t 성명 \t 부서코드 \t 업무코드 \t 급여 \t 입사일자");
		System.out.println("----------------------------");
		
		for(EmployeeDTO dto : list) {
			System.out.println( 
				dto.getEmployee_id() + "\t" +
				dto.getLast_name() + " " + dto.getFirst_name() + "\t" +
				dto.getDepartment_id() + "\t" +
				dto.getJob_id() + "\t" +
				dto.getSalary() + "\t" +
				dto.getHire_date() + "\t" +
				dto.getDepartment_name() + "\t" +
				dto.getJob_title()
			);
		}
		System.out.println("----------------------------");
	}
}

