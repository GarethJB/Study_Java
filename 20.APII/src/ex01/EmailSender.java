package ex01;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender {
	//메일보내는이의 메일주소, 보내는이 이름, 패스워드
	private String emailAddress, senderName, emailPassword;
	
	EmailSender(String emailAddress,String  senderName, String emailPassword) {
		this.emailAddress = emailAddress;
		this.senderName = senderName;
		this.emailPassword = emailPassword;
	}
	
	//html 메일 보내기
	void sendHtml(String email, String name, String emailPassword) {
		HtmlEmail mail = new HtmlEmail();
		mail.setDebug(true);
		mail.setHostName("smtp."+emailAddress.substring(emailAddress.indexOf("@")+1));
		mail.setAuthentication(emailAddress, emailPassword);
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom(emailAddress, senderName);
			mail.addTo(email, name);
			
			mail.setSubject("생일 축하 메시지");
			StringBuffer msg = new StringBuffer();
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<h2>").append(name).append("님 생일 축하<h2>");
			msg.append("<div>생일 축하 쿠폰이 발급되었습니다</div>");
			msg.append("<a target='_black' href='https://www.naver.com'</a> ");
			msg.append("<img src='https://cdn.pixabay.com/photo/2022/09/03/14 />");
			msg.append("</body>");
			msg.append("</html>");
			mail.setHtmlMsg(msg.toString());
			
			EmailAttachment file = new EmailAttachment();
			file.setURL(new URL("https://ichef.bbci.co.uk/news/624/cpsprodpb/4118/production/_119546661_gettyimages-1294130887.jpg.webp"));
			mail.attach(file);
			mail.send();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void sendAttach(String email, String name, String emailPassword) {
		MultiPartEmail mail = new MultiPartEmail();
		
		//메일서버지정
		mail.setDebug(true);
		mail.setHostName("smtp."+emailAddress.substring(emailAddress.indexOf("@")+1));
		mail.setAuthentication(emailAddress, emailPassword);	//인증
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom(emailAddress, senderName); //보내는이 지정
			mail.addTo(email, name);				//받는이 지정
			
			mail.setSubject("생일 축하 메시지 - 첨부파일 확인요망");
			mail.setMsg(name + "님! 생일 축하합니다 \n 생일쿠폰이 발급되었습니다"
					+ "당사 사이트에서 쿠폰함을 확인하세요!");
			
			EmailAttachment file = new EmailAttachment();	//첨부파일객체
			file.setPath("D:\\Study_Java\\Workspace\\20.APII\\src\\ex01\\mail.txt");
			mail.attach(file);	//첨부하기버튼 클릭
		
			file = new EmailAttachment();
			file.setURL(new URL("https://ichef.bbci.co.uk/news/624/cpsprodpb/4118/production/_119546661_gettyimages-1294130887.jpg.webp"));
			mail.attach(file);	//첨부하기버튼 클릭			
			mail.send();		//메일 보내기
		}catch(Exception e) {	
			System.out.println(e.getMessage());
		}
	}
	
	void sendSimple(String email, String name) {
		//메일 수신하는 이의 이메일주소, 이름
		SimpleEmail mail = new SimpleEmail();
		mail.setCharset("utf-8");
		//메일전송과정 확인하도록 로그출력
		mail.setDebug(true);
		
		//hong@naver.com → 빼기
		String host = emailAddress.substring(emailAddress.indexOf("@")+1);
		mail.setHostName("smtp." + host);
		
		//아이디 / 비번을 입력한 후 로그인버튼 클릭하기
		mail.setAuthentication(emailAddress, emailPassword);
		mail.setSSLOnConnect(true);
		
		try {
			//메일 보내는이 지정
			mail.setFrom(emailAddress, senderName);			
			//메일 받는이 지정
			mail.addTo(email, name);
			
			//메일 제목
			mail.setSubject("생일을 축하합니다");
			
			//메일 내용
			mail.setMsg(name + "님! 10% 할인쿠폰이 발행되었습니다.");
			
			//메일보내기 버튼 클릭
			mail.send();
			
		} catch (Exception e) {
		}
	}
	
}//class
