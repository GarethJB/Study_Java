package homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장을 입력하세요 : ");
		String line = scan.nextLine();
		scan.close();
		
		String filename = "문자실습";
		//입력한 문자열을 파일에 저장한다
		FileWriter writer = null;
		
		
		try {
			//파일열기
			writer = new FileWriter(filename);
			//쓰기
			writer.write(filename);			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			//파일닫기
			try {writer.close();} catch (Exception e2) {}
		}
		System.out.println("쓰기완료");
		
		//저장된 파일을 읽어서 콘솔에 출력한다
	 FileReader reader = null;
	 try {
		//파일 열기
		reader = new FileReader(filename);
		//읽기
		int data;
		while(true) {
//			data = reader.read();
//			if(data == -1) break;
//			//콘솔에 출력해서 눈으로 확인
//			System.out.println((char)data);			
//		}
		char datas[] = new char[5];
		while (reader.read(datas) != -1) {
			System.out.println(datas);
		}
		}
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	} catch(IOException e) {
		System.out.println(e.getLocalizedMessage());
	} finally {
		try {reader.close();} catch (Exception e) {}
	}
	 System.out.println("\n읽기완료");
		
	}//main()
}//class
