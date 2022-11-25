package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMain3 {
	public static void main(String[] args) {
		//13명의 정보가 있는 명단.txt 파일의 정보를 읽어서
		//d:/io/202호/student.html로
		//PrintWriter 를 사용한다
		//성명		성별	전화번호
		//홍길동	남		010-1234-5678
		//홍길동	남		010-1234-5678
		//홍길동	남		010-1234-5678
	
		String Filename = "src/data/명단.txt";
		BufferedReader in = null;
		PrintWriter out = null;
		String path = "src/data";
		
		try {
			String line;
			in = new BufferedReader(new FileReader(Filename));
			File dir = new File(path);
			if (!dir.exists()) dir.mkdir();
			
	        	out = new PrintWriter(path + "/students.html");
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
				while((line = in.readLine()) != null) {
					String data[] = line.split(",");
					out.print("<tr><td>"+ data[0] + "</td><td>" + data[1] + "</td><td>" + data[2] + "</td></tr>");				
				}
				out.print("</tbody>");			
				out.print("</table>");		
				out.print("</body>");
				out.print("</html>");
		} catch (IOException e) {} finally { try {out.close(); in.close();}
		catch (Exception e) {}}
	

}// main()

}// class
