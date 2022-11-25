package data;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMain {
	public static void main(String[] args) {
		String filename = "src/data/성적표.txt";
		PrintWriter out = null;
		try {
			out = new PrintWriter(filename);
			out.write("-----성적표-----");
			out.print("성명\t 자바\t View\t 오라클\n");
			out.println("홍길동\t 90\t 76\t 80");
			out.printf("%s\t %d\t %d\t %d\n", "심청", 84, 91, 74);
		} catch (IOException e) {
		} finally {
			try {out.close();} catch(Exception e) {}
		}
	}//main()
}//class
