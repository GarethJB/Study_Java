package string;

import java.io.FileWriter;
import java.io.IOException;

public class WriterMain {
	public static void main(String[] args) {
		FileWriter writer = null;
		String filename = "명단.txt";
		try {
			// Writer 시에는 해당 이름의 파일이 없으면 생성해준다
			// 파일에 추가쓰기를 하는 경우
			// : 생성자 두번째 파라미터 true/false
			// : 생성자 두번째 파라미터 true/false
			// 파일열기
			writer = new FileWriter(filename, true);
			
			//쓰기
			char[] datas = {'혼', '자', '공', '부', '하', '는', '자', '바'};
//			for(char ch : datas) {
//				writer.write(ch);
//			}
			writer.write(datas);
		} catch (IOException e) {
		} finally {
			//닫기
			try {writer.close();} catch(Exception e) {}
		}
		System.out.println("쓰기 완료");
	}//main()
}//class
