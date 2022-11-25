package ex03;

import java.util.Scanner;

public class EmployeeHome {
	private Scanner sc;
	public EmployeeHome(Scanner sc) {
		this.sc = sc;
		System.out.println("1.사원목록  2.부서목록  0.종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		if( menu==1 ) {
			//사원목록
			EmployeeList list = new EmployeeList(sc);
			list.display();
		}else if( menu==2 ) {
			
		}else {
			System.exit(0);
		}
	}
}
