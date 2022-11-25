package string;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMain3 {
	public static void main(String[] args) {
		FileReader reader = null;
		String filename = "명단.txt";
		try {
			reader = new FileReader(filename);
			char datas[] = new char[5];
			while(true) {
				int count = reader.read(datas);
				// 더이상 읽어올 데이터가 없으면 -1
				if(count == -1) break;
				System.out.println(String.valueOf(datas).trim());
			}
		} catch(FileNotFoundException e) {
		} catch(IOException E) {
		} finally {
			try {reader.close();} catch(Exception e) {}
		}
	}//main()
}//class
