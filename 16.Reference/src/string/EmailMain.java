package string;

public class EmailMain {
	public static void main(String[] args) {
				
		String emails[] = { "hong2022@naver.com",
							"park901082@daum.net",
							"sim@hrd.go.kr"
		};
		
		for (int i = 0; i < emails.length; i++) {
			int gol = emails[i].indexOf("@");
			System.out.printf("이메일 : %s \n아이디 : %s \n서비스 : %s \n \n",emails[i], emails[i].substring(0 , gol), emails[i].substring(gol + 1));
		}
		for(String email : emails) {
			System.out.println(email);
			String datas[] = email.split("@");
			for(String e : datas) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}//main()
}//class

// for문 {
//	이메일 : hong2022@naver,com
//	아이디 : hong2022
//	서비스 : naver.com
//	}	

/*
//문자열에서 특정문자열의 시작위치를 반환하는 메소드 : indexOF
// [     혼ja 공부하는 ja바]
System.out.println(subject.indexOf("공부"));

//문자열에서 문자열의 일부를 반환하는 메소드 : substring
//substring(대상, 시작인덱스, 끝위치+1)
System.out.println(subject.substring(7,9));
//substring(대상, 시작인덱스) : 시작위치 ~ 끝
System.out.println(subject.substring(7));
*/