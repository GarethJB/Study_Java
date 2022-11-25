package view;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		View.home = new EmployeeHome(sc);
		View.list = new EmployeeList(sc);
		View.info = new EmployeeInfo(sc);
		View.d_list = new DepartmentList(sc);
		View.d_info = new DepartmentInfo(sc);
		View.home.display();
		sc.close();
	}
}
