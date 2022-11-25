package ex01;

import java.sql.*;
public class SelectMain02 {
	public static void main(String[] args) {
		//드라이버로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "0000");
			//부서가 60번인 부서에 속한 
			//사원들의 정보(사번, 성명, 업무코드, 업무명, 급여, 입사일자) 조회
			String sql 
			= "select employee_id, last_name || first_name name "
					+ ", job_id, salary, hire_date, job_title "
			+ "from employees e inner join jobs j using(job_id) "
			+ "where department_id = 60";
			//쿼리문실행기능을 가진 클래스: Statement
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while( rs.next() ) {
				int employee_id = rs.getInt("employee_id");
				String name = rs.getString("name");
				String job_title = rs.getString("job_title");
				String job_id = rs.getString("job_id");
				int salary = rs.getInt("salary");
				Date hire_date = rs.getDate("hire_date");
				System.out.printf("%d %s %s %s %d %s \n"
					, employee_id, name, job_id, job_title, salary, hire_date);
			}
			rs.close();
			st.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
