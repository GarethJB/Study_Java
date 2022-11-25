package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DepartmentDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//DB연결처리
	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn
			= DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "0000");
		}catch(Exception e) {
		}
	}
	
	//부서목록조회
	public ArrayList<DepartmentDTO> department_list() {
		//107명의 사원정보를 담을 변수선언-자료구조
		//EmployeeDTO[] list = new EmployeeDTO[107];
		ArrayList<DepartmentDTO> dlist = new ArrayList<DepartmentDTO>();
		
		connect();
		String sql 
		= "select department_id, department_name "
		+ "from departments";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) { //커서가 이동되면
				//107명의 사원정보를 담는 처리
				DepartmentDTO ddto = new DepartmentDTO();
				ddto.setDepartment_id(rs.getInt("department_id"));
				ddto.setDepartmentname(rs.getString("department_name"));
				dlist.add(ddto);
			}
			
		} catch (Exception e) {
		} finally {
			disconnect();
		}
		return dlist;
	}
	
	//자원회수
	public void disconnect() {
		if( rs!=null ) { try{rs.close();}catch(Exception e) {} }		
		if( ps!=null ) { try{ps.close();}catch(Exception e) {} }		
		if( conn!=null ) { try{conn.close();}catch(Exception e) {} }		
	}
	
	//특정부서번호의 부서 정보조회
		public DepartmentDTO department_info(int employee_id) {
			DepartmentDTO ddto = null;
			connect();
			String sql 
			= "select e.department_id, department_name, m.first_name, l.city "
			+ "from employees e left outer join departments d "
			+ "on e.department_id = d.department_id "
			+ "left outer join locations l "
			+ "on d.location_id = l.location_id "
			+ "left outer join employees m "
			+ "on m.employee_id = e.manager_id "
			+ "where e.employee_id = ?";
			try {
				ps = conn.prepareStatement(sql);
				//쿼리문에 ? 가 있다면 ?에 값을 담는 처리를 한다
				ps.setInt(1, employee_id);
				rs = ps.executeQuery();
				if( rs.next() ) {
					ddto = new DepartmentDTO();
					ddto.setDepartment_id(rs.getInt("department_id"));
					ddto.setDepartmentname(rs.getString("department_name"));
					ddto.setManager_name( String.valueOf(rs.getInt("manager_id")));
					ddto.setCity(rs.getInt("location_id"));
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				disconnect();
			}
			return ddto; //특정 부서의 정보를 반환
		}
	
	
}
