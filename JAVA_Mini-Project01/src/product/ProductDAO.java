package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import test.Productinfo;

public class ProductDAO {
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
	
	//상품목록조회
	public ArrayList<ProductDTO> product_list() {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		connect();
		String sql
		= "SELECT num, name, company, price, qty "
		+ "FROM tbl_java_product "
		+ "ORDER BY 1 ";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setCompany(rs.getString("company"));
				dto.setPrice(rs.getInt("price"));
				dto.setQty(rs.getInt("qty"));
				list.add(dto);
			}//while
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
		return list;
	}//product_list()
	
	//정보갱신
		public void infoUpdate() {
			ProductDTO dto = null;
			connect();
			String sql
			= "SELECT num, name, company, price, qty "
			+ "FROM tbl_java_product "
			+ "WHERE num = ? ";
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, Productinfo.productInfo.getNum());
				rs = ps.executeQuery();			
				if (rs.next()) {
					dto = new ProductDTO();
					dto.setNum(rs.getInt("num"));
					dto.setName(rs.getString("name"));
					dto.setCompany(rs.getString("company"));
					dto.setPrice(rs.getInt("price"));
					dto.setQty(rs.getInt("qty"));
					Productinfo.productInfo = dto;
				}//if
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				disconnect();
			}//finally
		}//infoUpdate()
	
		
		
//	//제목으로 검색
//	public void productName_search(String name) {
//		ArrayList<ProductDTO> list = product_list();
//		for(ProductDTO dto : list) {
//			dto.getName();
//			if (name.equals(dto.getName())) {
//				connect();
//				String sql
//				= "SELECT num, name, company, price, qty "
//				+ "FROM tbl_java_product "
//				+ "WHERE name LIKE '%'||?||'%' "
//				+ "ORDER BY 1 ";
//				try {
//					ps = conn.prepareStatement(sql);
//					ps.setString(1, name);
//					rs = ps.executeQuery();
//					System.out.println("\n◆                                                                     ◆");
//					System.out.println("                             검색 상품 목록                             ");
//					System.out.println("\n========================================================================");
//					System.out.printf(" %-1s \t %-15s \t %-10s \t %-5s \t %s \n", "번호", "이름", "출판사", "가격", "수량");
//					System.out.println("------------------------------------------------------------------------");
//					while(rs.next()) {
//						dto = new ProductDTO();
//						dto.setNum(rs.getInt("num"));
//						dto.setName(rs.getString("name"));
//						dto.setCompany(rs.getString("company"));
//						dto.setPrice(rs.getInt("price"));
//						dto.setQty(rs.getInt("qty"));
//						list.add(dto);
//						System.out.printf("\n %-1d \t %-10s \t %-10s %-10d \t %d", dto.getNum(), dto.getName(), dto.getCompany(), dto.getPrice(), dto.getQty());
//					}//while
//					break;
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				} finally {
//					disconnect();
//				}//finally
//			} else {
//				System.out.println("\n일치하는 상품이 없습니다.");
//				break;
//			}//if
//		}//for
//	}//productName_search()
	
	
	
	//제목으로 검색
	public ArrayList<ProductDTO> productName_search(String name) {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		ProductDTO dto = null;
		
		connect();
		String sql
		= "SELECT num, name, company, price, qty "
		+ "FROM tbl_java_product "
		+ "WHERE name LIKE '%'||?||'%' "
		+ "ORDER BY 1 ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			while(rs.next()) {
				dto = new ProductDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setCompany(rs.getString("company"));
				dto.setPrice(rs.getInt("price"));
				dto.setQty(rs.getInt("qty"));
				list.add(dto);			
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
		return list;
	}//productName_search()
	
	//출판사로 검색
	public ArrayList<ProductDTO> productCompany_search(String company) {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		ProductDTO dto = null;
		connect();
		String sql
		= "SELECT num, name, company, price, qty "
		+ "FROM tbl_java_product "
		+ "WHERE company LIKE '%'||?||'%'";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, company);
			rs = ps.executeQuery();
			while(rs.next()) {
				dto = new ProductDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setCompany(rs.getString("company"));
				dto.setPrice(rs.getInt("price"));
				dto.setQty(rs.getInt("qty"));
				list.add(dto);			
			}//while
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}//finally
		return list;
	}//productCompany_search()
	
	//상품 추가
		public void productAdd(int num, String name, String company, int price, int qty) {
			connect();
			String sql
			= "INSERT INTO TBL_JAVA_PRODUCT "
			+ "VALUES (product_seq.NEXTVAL, ?, ?, ?, ?) ";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, name);	
				ps.setString(2, company);	
				ps.setInt(3, price);	
				ps.setInt(4, qty);	
				rs = ps.executeQuery();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				disconnect();
			}//finally
		}//productCompany_search()
		
	//상품 삭제
		public void productDelete(int num) {
			ArrayList<ProductDTO> list = product_list();
			for(ProductDTO dto : list) {
				dto.getNum();
				if (num == dto.getNum()) {
					connect();
					String sql
					= "DELETE FROM TBL_JAVA_PRODUCT "
					+ "WHERE num = ? ";
					try {
						ps = conn.prepareStatement(sql);
						ps.setInt(1, num);
						rs = ps.executeQuery();
						System.out.print("\n              ");
						System.out.print("\n▶ 삭제완료 ◀");
						System.out.print("\n            \n\n");
					} catch (Exception e) {
						System.out.println(e.getMessage());
					} finally {
						disconnect();
					}//finally
				} else if (num != dto.getNum()) {
					System.out.println("\n일치하는 상품이 없습니다.\n");			
					break;
				}//if
			}//for
		}//productDelete()
		
		//상품 입고
		public void productipgo(int num, int qty) {
			connect();
			String sql
			= "UPDATE TBL_JAVA_PRODUCT "
			+ "SET qty = qty + ? "
			+ "WHERE num = ? ";
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, qty);
				ps.setInt(2, num);
				rs = ps.executeQuery();
				System.out.print("\n              ");
				System.out.print("\n▶ 입고완료 ◀");
				System.out.print("\n              \n\n");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				disconnect();
			}//finally					
		}//productipgo()
		
		//상품 출고
		public void productchulgo(int num, int qty) {
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
				System.out.print("\n              ");
				System.out.print("\n▶ 출고완료 ◀");
				System.out.print("\n              \n\n");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				disconnect();
			}//finally
		}//productchulgo()
	
}//class
