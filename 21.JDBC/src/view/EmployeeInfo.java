package view;

import java.awt.Desktop;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Scanner;

import employee.EmployeeDAO;
import employee.EmployeeDTO;

public class EmployeeInfo {
	private Scanner sc;
	public EmployeeInfo( Scanner sc ){
		this.sc = sc;
	}
	public void displayHtml(int employee_id) {
		EmployeeDAO dao = new EmployeeDAO(); // DB에 연결하기 위한 객체
		EmployeeDTO dto = dao.employee_info(employee_id); // 특정사번의 사원정보를 조회
		
		String path = "d:/io/view/", filename = "emp_info_"+ employee_id + ".html";
		View.makeFolder(path);
		
		PrintWriter out = null;
		try {
			out = new PrintWriter(path + filename);
			out.printf("<html>");
			out.printf("<body>");
			out.printf("<h2>사원정보</h2>");
			out.printf("<table border='1'>");
			out.printf("<tr>");
			out.printf("<th style='width:160px'>사번</th><td>%d</td>", dto.getEmployee_id());
			out.printf("</tr>");
			out.printf("<tr><th>성명</th><td>%s</td></tr>", dto.getName());
			out.printf("<tr><th>부서명</th><td>%s</td></tr>", dto.getDepartment_name());
			out.printf("<tr><th>이메일</th><td>%s</td></tr>", dto.getEmail());
			out.printf("<tr><th>전화번호</th><td>%s</td></tr>", dto.getPhone_number());
			out.printf("<tr><th>급여</th><td>%d</td></tr>", dto.getSalary());
			out.printf("<tr><th>입사일자</th><td>%d</td></tr>", dto.getHire_date());
			out.printf("</table>");
			out.printf("</body>");
			out.printf("</html>");
			out.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {			
			out.close();
		}
		try {
			Desktop.getDesktop().browse(new URI("file://" + path + filename));			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void display(int employee_id) {
		displayHtml(employee_id);
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO dto = dao.employee_info(employee_id);
		
		System.out.println("\t\t\t[ 사원정보 ]");
		if( dto==null ) {
			System.out.println("사원정보 없습니다");
		}else {
			System.out.printf("%-15s\t: %d\n",
							"사번", dto.getEmployee_id());
			System.out.printf("%-15s\t: %s\n",
					"성명", dto.getName());
			System.out.printf("%-15s\t: %s\n",
					"이메일", dto.getEmail());
			System.out.printf("%-15s\t: %s\n",
					"전화번호", dto.getPhone_number());
			System.out.printf("%-15s\t: %s\n",
					"입사일자", dto.getHire_date());
			System.out.printf("%-15s\t: %d\n",
					"급여", dto.getSalary());
			System.out.printf("%-15s\t: %s\n",
					"부서명", dto.getDepartment_name());
		}
		
		System.out.println("1.홈화면  2.사원목록  0.종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		if( menu==1 ) {
			View.home.display();
		}else if( menu==2 ) {
			View.list.display();
		}else if( menu==0 ) {
			System.exit(0);
		}
	}
}
