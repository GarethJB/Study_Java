package ex01;

public class EmailMain {
	public static void main(String[] args) {
		
	//javaee.github.io
	//>Migrated Project : javamail
	
	
	EmailSender email =
	new EmailSender("wneod3247@naver.com", "고객센터", "wneod2587!");
	
//	email.sendSimple("wneod3247@naver.com", "임주빈");
//	email.sendAttach("wneod3247@naver.com", "고객센터", "wneod2587!");
	email.sendHtml("wneod3247@naver.com", "고객센터", "wneod2587!");
	}//main()
}//class
