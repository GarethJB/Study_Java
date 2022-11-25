package data;

import java.io.IOException;
import java.io.PrintWriter;

public class ScoreMain {
	public static void main(String[] args) {
		String filename = "src/data/score.html";
		PrintWriter out = null;
		try {
			out = new PrintWriter(filename);
			out.print("<html>");
			out.print("<body>");
			out.print("<h3>성적표</h3>");
			out.print("<table border='1'>");
			out.print("<tr><th>성명</th><th>자바</th><th>view</th>");
			out.print("</tr>");
			out.print("<tr><th>홍길동</th><th>85</th><th>96</th>");
			out.print("</tr>");
			out.print("<tr><th>박문수</th><th>41</th><th>82</th>");
			out.print("</tr>");
			out.print("</table>");
			out.print("</body>");
			out.print("</html>");
		} catch(IOException e) {
			
		} finally {
			try {out.close();} catch(Exception e){}		
		}//finally
	}//main()
}//class
