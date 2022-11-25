package object;

public class MemberMain {
	public static void main(String[] args) {
		MemberDTO hong =
		new MemberDTO("홍길동", "hong", "1234", "남");
		System.out.println("이름 : " + hong.getName());
		System.out.println("아이디 : " + hong.getId());
		System.out.println("비밀번호 : " + hong.getPw());
		System.out.println("성별 : " + hong.getGender());
		System.out.println();
		
		// 생성된 회원정보를 문자열로 바꿔 확인하기
		String info = hong.toString();
		System.out.println(info);
	}//mian()
}//class
