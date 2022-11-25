package message;

public class SMSMessageSender extends MessageSender {
	String senderPhone;
	SMSMessageSender(String title, String senderName, String messageContent, String senderPhone) {
		super(title, senderName, messageContent);
		this.senderPhone = senderPhone;
	}//SMSMessageSender
	void sendMessage(String receiver) {
		System.out.println("SMS 발신 ------------");
		System.out.println("제목 : " + title);
		System.out.printf("보내는 이 : %s(%s)\n", senderName, senderPhone);
		System.out.println("받는이 : " + receiver);
		System.out.println("내용 : " + messageContent);
		System.out.println("------------------------");
	}
}//class
