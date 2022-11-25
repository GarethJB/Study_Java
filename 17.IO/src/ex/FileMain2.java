package ex;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain2 {
	public static void main(String[] args) {
		//특정 폴더 안에 파일로 문자데이터를 쓰기작업을 해서 내보내자.
		//Reader/Writer -> FileReader/FileWriter
		//문자데이터 쓰기에 특화되어 있는 클래스: PrintWriter
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		String today = df.format( new Date() );
		String path = "d:/io/" + today;
		File dir = new File( path );
		if( ! dir.exists() ) dir.mkdirs();
		
		PrintWriter out = null;
		
		try {
			out = new PrintWriter( path + "/명단.html" );
			out.print("<html>");
			out.print("<body>");
			out.println("<style>");
			out.println("thead th:first-child{ width:160px} ");
			out.println("thead th:nth-child(2){ width:100px} ");
			out.println("thead th:last-child{ width:200px} ");
			out.println("table td{ text-align:center } ");
			out.println("</style>");
			out.print("<h3>스마트 웹&앱 202호</h3>");
			out.print("<table border='1'>");
			out.print("<thead>");
			out.print("<tr><th>이름</th><th>성별</th><th>전화번호</th></tr>");
			out.print("</thead>");
			out.print("<tbody>");
			out.print("<tr><td>홍길동</td><td>남</td><td>010-1234-5678</td></tr>");
			out.print("<tr><td>심청</td><td>여</td><td>062-7125-7141</td></tr>");
			out.print("<tr><td>박문수</td><td>남</td><td>010-3214-6578</td></tr>");
			out.print("</tbody>");			
			out.print("</table>");		
			out.print("</body>");
			out.print("</html>");
			
		}catch(IOException e) {
		}finally {
			out.close();
		}
	}
}
