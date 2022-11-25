package ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMain01 {
	public static void main(String[] args) {
		//드라이버 연결하기
		//1.드라이버 생성 : 드라이버관리자가 생성된다
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			System.out.println("드라이버 로딩완료");
			
		//DB연결
		//2.DB위치 지정 - 드라이버관리자를 통해 
			//localhost:127.0.0.1=192.138.0.38
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", "0000");
			System.out.println("DB 연결 성공");
			
		//쿼리문 실행
		//3. 쿼리문 작성
			String sql = "select * from employees";
			//쿼리문실행 : developer에서의 ctrl + enter
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {	//커서가 이동되는지 확인
				int employee_id = rs.getInt("employee_id");	//사번
				String name = 	rs.getString("last_name") + " " +
								rs.getString("first_name");	//성명
				int department_id = rs.getInt("department_id");	//부서코드
				Date hire_date = rs.getDate("hire_date");//입사일자
				System.out.printf("%d %s %d %s \n", employee_id, name, department_id, hire_date);
			}
			rs.close();
			st.close();
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}//main()
}//class
