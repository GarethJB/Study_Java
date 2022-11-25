public class Ex_if_else {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println("입력값 : " + num1);
		if(num1 % 2 == 0) {
			System.out.println(num1 + "은 짝수입니다.");	
		} else {
			System.out.println(num1 + "은 홀수입니다.");
		}//if
	}//main()
}//class

/*
 ◆ 블럭 if문 : 조건을 판단하여 true일 때 또는 false일 때의 명령을 실행
 
 	if(조건식) {
 		실행문; // 조건식이 true일 때 실행
 	} else {
 		실행문; // 조건식이 false일 때 실행
 	}//if
 	
 
 
 */
