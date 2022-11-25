package byte_ex;

import java.io.*;

public class OutputMain2 {
	public static void main(String[] args) {
		// 파일을 읽어서 파일에 쓰기
		String readfile = "me.jpg", writefile = "image.jpg";
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(readfile);			
			out = new FileOutputStream(writefile);			
			byte[] buf = new byte[1024];
			//5,545 : 1024 1024 1024 1024 
			int data;	// 읽어온 데이터의 갯수
			while((data = in.read(buf)) != -1) {
				out.write(buf);
			}
			in.read(buf);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally { 
			try {in.close();} catch (Exception e) {}
			try {out.close();} catch (Exception e) {}
		}//finally
		System.out.println("읽고 쓰기 완료");
	}//main()
}//class
