package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import product.ProductDAO;
import product.ProductDTO;
import test.Logininfo;

public class UserDAO {
	ProductDAO dao = new ProductDAO();
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//DB연결처리
	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@211.223.59.99:1521:xe", "smart10", "0000");			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}//catch
	}//connect()
	
	//자원회수
	public void disconnect() {
		if( rs!=null ) { try{rs.close();}catch(Exception e) {} }		
		if( ps!=null ) { try{ps.close();}catch(Exception e) {} }		
		if( conn!=null ) { try{conn.close();}catch(Exception e) {} }		
	}//disconnect()
	
	//로그인 정보
	public UserDTO login(String id, String pw) {
		UserDTO dto = null;
		connect();
		String sql
		= "SELECT id, pw, name, admin, email, money "
		+ "FROM tbl_java_user "
		+ "WHERE id = ? " 
		+ "AND pw = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();			
			if (rs.next()) {
				dto = new UserDTO();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setAdmin(rs.getString("admin"));
				dto.setEmail(rs.getString("email"));
				dto.setMoney(rs.getInt("money"));
			}//if
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
		return dto;
	}//login()
	
	//정보갱신
	public void infoUpdate() {
		UserDTO dto = null;
		connect();
		String sql
		= "SELECT id, pw, name, admin, email, money "
		+ "FROM tbl_java_user "
		+ "WHERE id = ? " 
		+ "AND pw = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, Logininfo.logininfo.getId());
			ps.setString(2, Logininfo.logininfo.getPw());
			rs = ps.executeQuery();			
			if (rs.next()) {
				dto = new UserDTO();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setAdmin(rs.getString("admin"));
				dto.setEmail(rs.getString("email"));
				dto.setMoney(rs.getInt("money"));
				Logininfo.logininfo = dto;
			}//if
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
	}//infoUpdate()
	
	//회원가입
	public void join(String id, String pw, String name, String email) {
		connect();
		String sql
		= "INSERT INTO TBL_JAVA_USER(id, pw, name, email) "
		+ "VALUES (?, ?, ?, ?) ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, email);
			rs = ps.executeQuery();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
	}//join()
	
	
	//회원정보조회
	public ArrayList<UserDTO> user_info(String id) {
		ArrayList<UserDTO> info = new ArrayList<UserDTO>();
		connect();
		String sql
		= "SELECT name, email, money "
		+ "FROM tbl_java_user "
		+ "WHERE id = '%?%' ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setMoney(rs.getInt("money"));
				info.add(dto);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
		return info;
	}//user_info()
	
	//금액 충전
	public void money_charge(int money, String id) {
		connect();
		String sql
		= "UPDATE TBL_JAVA_USER "
		+ "SET money = money + ? "
		+ "WHERE id = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, id);
			rs = ps.executeQuery();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
	}//money_charge()
	
	//상품 정보
	public ProductDTO productInfo(int num) {
		ProductDTO dto = null;
		connect();
		String sql
		= "SELECT num, name, company, price, qty "
		+ "FROM tbl_java_product "
		+ "WHERE num = ? " ;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();			
			if (rs.next()) {
				dto = new ProductDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setCompany(rs.getString("company"));
				dto.setPrice(rs.getInt("price"));
				dto.setQty(rs.getInt("qty"));
			}//if
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
		return dto;
	}//login()
		
	//상품 주문
	public void productOrder(int qty, int num) {
		connect();
		String sql
		= "UPDATE TBL_JAVA_PRODUCT "
		+ "SET qty = qty - ? "
		+ "WHERE num = ? ";		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, qty);
			ps.setInt(2, num);
			rs = ps.executeQuery();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
	}//product_order()
	
	//결제
	public void payment(int money, String id) {
		connect();
		String sql
		= "UPDATE TBL_JAVA_USER "
		+ "SET money = money - ? "
		+ "WHERE id = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, id);
			rs = ps.executeQuery();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
	}//payment()
	
}//class
