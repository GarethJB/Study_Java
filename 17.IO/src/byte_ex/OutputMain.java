package byte_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputMain {
	public static void main(String[] args) {
		String filename = "data.out";
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream(filename);			
			byte[] data = {1, 2, 3 ,4 ,5, 6 ,7 ,8 ,9, 10};	// -256 ~ 255
			out.write(data);
		} catch (IOException e) {
		} finally {try {out.close();} catch (Exception e) {}}
		System.out.println("쓰기 완료");
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(filename);
//			while(true) {
//				int data = in.read();
//				if(data == -1) break;
//				System.out.println(data);
//			}
			int data;
			while((data = in.read()) != -1) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {in.close();} catch (Exception e) {}
		}//finally
	}//main()
}//class
