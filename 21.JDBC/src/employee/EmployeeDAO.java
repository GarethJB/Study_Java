package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeDAO {
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
	
	//사원목록조회
	public ArrayList<EmployeeDTO> employee_list() {
		//107명의 사원정보를 담을 변수선언-자료구조
		//EmployeeDTO[] list = new EmployeeDTO[107];
		ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		
		connect();
		String sql 
		= "select e.*, department_name"
		+ "		  , last_name||' '||first_name name "
		+ "from employees e left outer join departments d "
		+ "on e.department_id = d.department_id";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) { //커서가 이동되면
				//107명의 사원정보를 담는 처리
				EmployeeDTO dto = new EmployeeDTO();
				dto.setName( rs.getString("name") );
				dto.setDepartment_name( 
						rs.getString("department_name"));
				dto.setEmployee_id( rs.getInt("employee_id") );
				dto.setLast_name( rs.getString("last_name") );
				dto.setFirst_name( rs.getString("first_name") );
				dto.setJob_id( rs.getString("job_id") );
				dto.setDepartment_id( rs.getInt("department_id") );
				dto.setSalary( rs.getInt("salary") );
				dto.setPhone_number( rs.getString("phone_number") );
				dto.setEmail( rs.getString("email") );
				dto.setHire_date( rs.getDate("hire_date"));
				list.add(dto);
			}
			
		} catch (Exception e) {
		} finally {
			disconnect();
		}
		return list;
	}
	
	//자원회수
	public void disconnect() {
		if( rs!=null ) { try{rs.close();}catch(Exception e) {} }		
		if( ps!=null ) { try{ps.close();}catch(Exception e) {} }		
		if( conn!=null ) { try{conn.close();}catch(Exception e) {} }		
	}
	
	//특정사번의 사원정보조회
	public EmployeeDTO employee_info(int employee_id) {
		EmployeeDTO dto = null;
		connect();
		String sql 
		= "select e.last_name||' '||e.first_name name "
		+ " 	  , department_name, job_title "
		+ "	      , m.employee_id manager_id "
		+ "	      , m.last_name||' '||m.first_name manager_name "
		+ "		  , e.* "
		+ "from employees e left outer join departments d "
		+ "on e.department_id = d.department_id "
		+ "inner join jobs j on e.job_id = j.job_id "
		+ "left outer join employees m on e.manager_id = m.employee_id "
		+ "where e.employee_id = ?";
		try {
			ps = conn.prepareStatement(sql);
			//쿼리문에 ? 가 있다면 ?에 값을 담는 처리를 한다
			ps.setInt(1, employee_id);
			rs = ps.executeQuery();
			if( rs.next() ) {
				dto = new EmployeeDTO();
				dto.setDepartment_name( rs.getString("department_name") );
				dto.setJob_title( rs.getString("job_title") );
				dto.setManager_id( rs.getInt("manager_id") );
				dto.setManager_name( rs.getString("manager_name") );
				dto.setEmployee_id( rs.getInt("employee_id") );
				dto.setName( rs.getString("name") );
				dto.setEmail( rs.getString("email") );
				dto.setPhone_number( rs.getString("phone_number") );
				dto.setDepartment_id( rs.getInt("department_id") );
				dto.setSalary( rs.getInt("salary") );
				dto.setJob_id( rs.getString("job_id") );
				dto.setHire_date( rs.getDate("hire_date") );
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return dto; //특정 사원의 정보를 반환
	}
}
