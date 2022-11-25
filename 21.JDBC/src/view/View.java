package view;

import java.io.File;

public class View {
	static EmployeeHome home;
	static EmployeeList list;
	static EmployeeInfo info;
	static DepartmentList d_list;
	static DepartmentInfo d_info;
	
	static void makeFolder(String path) {
		File dir = new File(path);
		if(! dir.exists()) dir.mkdirs();
	}
}
