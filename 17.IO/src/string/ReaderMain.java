package string;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMain {
	public static void main(String[] args) {
		FileReader reader = null;
		// 1. 파일열기 : 파일명 지정
		try {
			reader = new FileReader("명단.txt");		
			// 2. 내용읽기
			while(true) {
				int data = reader.read(); //문자한개 : char
				// 더 이상 읽어올 문자가 없으면 -1
				if(data == -1) break;
				System.out.println((char)data);
			}//while 
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {reader.close();} catch (Exception e) {}
		}//finally
		
		// 3. 파일닫기
	}//main()
}//class
