package view;

import java.util.Scanner;

public class EmployeeHome {
	private Scanner sc;
	public EmployeeHome( Scanner sc ){
		this.sc = sc;
	}
	public void display() {
		System.out.println("1.사원목록   2.부서목록   0.종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		if( menu == 1 ) {
			View.list.display();
		}else if( menu == 2 ) {
			View.d_list.display();
		}else if( menu == 0 ) {
			System.exit(0);
		}
	}
}
