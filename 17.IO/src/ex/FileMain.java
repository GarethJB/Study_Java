package ex;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileMain {
	public static void main(String[] args) {
		File file = 
		new File("D:\\미니프로젝트-제출\\실습과제\\명단.txt");
		System.out.println("수정일시 : " + file.lastModified());
		
		SimpleDateFormat df =
		new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss");
		String now = df.format(new Date(0));
		System.out.println("현재 : " + now);
		System.out.println("수정일시 : " + df.format(new Date(file.lastModified())));
		
		
		File folder = new File("src");
		File[] lis = folder.listFiles();
		File[] list = null;
		for(File f : list) {
			System.out.printf("%s %s %s \n", f.getName(), f.isDirectory(), df.format(new Date(file.lastModified())));
		}
			
	}//main()
}//class
