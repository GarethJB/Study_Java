package test;

import java.util.ArrayList;
import java.util.Scanner;

import product.ProductDAO;
import product.ProductDTO;
public class Productsearch {
	ProductDAO dao = new ProductDAO();
	ArrayList<ProductDTO> list;
	public void search(Scanner sc) {
		System.out.println("1.제목으로 검색 \t 2.출판사로 검색 \t 3.메뉴로 돌아가기 \n");
		System.out.print("선택 : ");
		int select = sc.nextInt();
		if (select == 1) {
			System.out.println("\n▶ 제목으로 검색 ◀");
			System.out.print("\n검색 : ");
			String name = sc.next();			
			list = dao.productName_search(name);
			System.out.println("\n◆                                                                     ◆");
			System.out.println("                             검색 상품 목록                             ");
			System.out.println("\n========================================================================");
			System.out.printf(" %-1s \t %-15s \t %-10s \t %-5s \t %s \n", "번호", "이름", "출판사", "가격", "수량");
			System.out.println("------------------------------------------------------------------------");
			for (ProductDTO dto : list) {
				System.out.printf("\n %-1d \t %-10s \t %-10s %-10d \t %d", dto.getNum(), dto.getName(), dto.getCompany(), dto.getPrice(), dto.getQty());
			}//for
			System.out.println("\n\n========================================================================");
			System.out.println("\n\n◆                                                                     ◆");
			System.out.println("\n               ");
			System.out.println("\n▶ 검색 완료 ◀");
			System.out.println("\n               ");
		} else if (select == 2) {
			System.out.println("\n▶ 출판사로 검색 ◀");
			System.out.print("\n검색 : ");
			String company = sc.next();
			list = dao.productCompany_search(company);			
			System.out.println("\n◆                                                                     ◆");
			System.out.println("                             검색 상품 목록                             ");
			System.out.println("\n========================================================================");
			System.out.printf(" %-1s \t %-15s \t %-10s \t %-5s \t %s \n", "번호", "이름", "출판사", "가격", "수량");
			System.out.println("------------------------------------------------------------------------");
			for (ProductDTO dto : list) {
				System.out.printf("\n %-1d \t %-10s \t %-10s %-10d \t %d", dto.getNum(), dto.getName(), dto.getCompany(), dto.getPrice(), dto.getQty());
			}//for
			System.out.println("\n\n========================================================================");
			System.out.println("\n\n◆                                                                     ◆");
			System.out.println("\n               ");
			System.out.println("\n▶ 검색 완료 ◀");
			System.out.println("\n               ");
		} else if (select == 3){
			System.out.println("\n메뉴로 돌아갑니다.");
		} else {
			System.out.println("\n유효하지 않은 명령입니다.");			
		}//else
	}//search


//public class Productsearch {
//	ProductDAO dao = new ProductDAO();
//	ArrayList<ProductDTO> list;
//	public void search(Scanner sc) {
//		System.out.println("1.제목으로 검색 \t 2.출판사로 검색 \t 3.메뉴로 돌아가기 \n");
//		System.out.print("선택 : ");
//		int select = sc.nextInt();
//		if (select == 1) {
//			System.out.println("\n▶ 제목으로 검색 ◀");
//			System.out.print("\n검색 : ");
//			String name = sc.next();			
//			dao.productName_search(name);
//		} else if (select == 2) {
//			System.out.println("\n▶ 출판사로 검색 ◀");
//			System.out.print("\n검색 : ");
//			String company = sc.next();
//			list = dao.productCompany_search(company);			
//			System.out.println("\n◆                                                                     ◆");
//			System.out.println("                             검색 상품 목록                             ");
//			System.out.println("\n========================================================================");
//			System.out.printf(" %-1s \t %-15s \t %-10s \t %-5s \t %s \n", "번호", "이름", "출판사", "가격", "수량");
//			System.out.println("------------------------------------------------------------------------");
//			for (ProductDTO dto : list) {
//				System.out.printf("\n %-1d \t %-10s \t %-10s %-10d \t %d", dto.getNum(), dto.getName(), dto.getCompany(), dto.getPrice(), dto.getQty());
//			}//for
//			System.out.println("\n\n========================================================================");
//			System.out.println("\n\n◆                                                                     ◆");
//			System.out.println("\n               ");
//			System.out.println("\n▶ 검색 완료 ◀");
//			System.out.println("\n               ");
//		} else if (select == 3){
//			System.out.println("\n메뉴로 돌아갑니다.");
//		} else {
//			System.out.println("\n유효하지 않은 명령입니다.");			
//		}//else
//	}//search
}//class
