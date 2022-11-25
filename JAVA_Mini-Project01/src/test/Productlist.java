package test;

import java.util.ArrayList;

import product.ProductDAO;
import product.ProductDTO;

public class Productlist {
	public void display() {
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> list = dao.product_list();
		System.out.println("\n◆                                                                     ◆");
		System.out.println("                               상품 목록                               ");
		System.out.println("\n========================================================================");
		System.out.printf(" %-1s \t %-15s \t %-10s \t %-5s \t %s \n", "번호", "이름", "출판사", "가격", "수량");
		System.out.println("------------------------------------------------------------------------");
		for(ProductDTO dto : list) {
			System.out.printf("\n %-1d \t %-10s \t %-10s %-10d \t %d", dto.getNum(), dto.getName(), dto.getCompany(), dto.getPrice(), dto.getQty());
		}//for
		System.out.println("\n\n========================================================================");
		System.out.println("\n\n◆                                                                     ◆\n");
	}//display()
}//class
