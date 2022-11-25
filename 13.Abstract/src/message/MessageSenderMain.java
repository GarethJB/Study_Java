package message;

public class MessageSenderMain {
	public static void main(String[] args) {
		
		EmailMessageSender email = 
		new EmailMessageSender("생일을 축하합니다", "고객센터", "10% 할인쿠폰이 발행되었습니다","admin@hrd.go.kr");
		email.sendMessage("ehjkw@naver.com");
		
		SMSMessageSender sms =
		new SMSMessageSender("생일을 축하합니다", "고객센터", "10% 할인쿠폰이 발행되었습니다", "02-541-9865");
		sms.sendMessage("01045467542");
		
	}//main()
}//class
