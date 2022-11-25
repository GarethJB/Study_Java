package view;

import java.awt.Desktop;
import java.io.File;
import java.io.PrintWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Scanner;

import employee.EmployeeDAO;
import employee.EmployeeDTO;

public class EmployeeList {
	private Scanner sc;
	public EmployeeList( Scanner sc ){
		this.sc = sc;
	}
	public void displayHtml() {
		ArrayList<EmployeeDTO> list
			= new EmployeeDAO().employee_list();
		
		String path = "d:/io/view/", filename= "emp_list.html";
		File dir = new File(path);
		if( ! dir.exists() ) dir.mkdirs();
		//	폴더가 없으면(!) 만든다
		
		PrintWriter out = null;
		try {
			out = new PrintWriter( path + filename );
			out.print("<html>");
			out.print("<body>");
			out.print("<h2>사원목록</h2>");
			out.print("<table border='1' style='width:800px'>");
			out.print("<tr>");
			out.print("	<th style='width:100px'>사번</th>");
			out.print("	<th style='width:200px'>성명</th>");
			out.print("	<th>부서명</th>");
			out.print("	<th style='width:120px'>급여</th>");
			out.print("	<th style='width:120px'>입사일자</th>");
			out.print("</tr>");
			
			for(EmployeeDTO dto : list) {
				out.print("<tr>");
				out.printf("<td><a href='emp_info_%d.html'>%d</a></td>", dto.getEmployee_id(), dto.getEmployee_id());
				out.print("	<td>"+ dto.getName() +"</td>");
				out.print("	<td>"+ dto.getDepartment_name() +"</td>");
				out.print("	<td>"+ dto.getSalary() +"</td>");
				out.print("	<td>"+ dto.getHire_date() +"</td>");
				out.print("</tr>");
			}
			
			out.print("</table>");			
			out.print("</body>");
			out.print("</html>");
		}catch(Exception e) {
		}finally {
			try{ out.close(); }catch(Exception e) {}
		}

		try {
			Desktop.getDesktop().browse( 
					new URI("file://" + path + filename ) );
		} catch (Exception e) {
		}
	}
	public void display() {
		displayHtml();
		
		EmployeeDAO dao = new EmployeeDAO();
		ArrayList<EmployeeDTO> list = dao.employee_list();
		
		System.out.println("\t\t\t\t[ 사원목록 ]");
		System.out.println(
			"사번\t성명\t\t\t부서명\t\t급여\t입사일자");
		for(EmployeeDTO dto : list) {
			System.out.print(dto.getEmployee_id() + "\t");
			System.out.printf("%-20s \t",dto.getName());
			System.out.printf("%-13s \t", dto.getDepartment_name());
			System.out.printf("%-15d", dto.getSalary());
			System.out.printf("%s \n", dto.getHire_date());
		}		
		
		System.out.println("1.홈화면   2.사원정보  0.종료");
		System.out.print("선택: ");
		switch( sc.nextInt() ) {
		case 1:
			View.home.display();
			break;
		case 2:
			System.out.print("조회할 사번: ");
			int emloyee_id = sc.nextInt();
			View.info.display(emloyee_id);
			break;
		default:
			System.exit(0);
		}
	}
}
