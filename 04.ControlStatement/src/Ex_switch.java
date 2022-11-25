public class Ex_switch {
	public static void main(String[] args) {
		int score = 78;
		System.out.println("점수 : " + score);
		
		switch (score) {
		case 100:
			System.out.println("A학점");
			break;
		case 99:
			System.out.println("A학점");
			break;
		case 98:
			System.out.println("A학점");
			break;
		default: 
			break;
		} //switch ▶ case 비교값을 일일이 작성해야 하는 불편함	
	}//main()
}//class

/*
 ○ 선택문(switch ~ case) : 다중 if문을 간략하게 표현
 
 switch(기준값){
 		case 값1 : 
 			값1이 참일 때 실행되는 문장;
 			break;
 		case 값2 : 
 			값2이 참일 때 실행되는 문장;
 			break;
 		case 값N : 
 			값N이 참일 때 실행되는 문장;
 			break;
 		default : 
 			거짓일 때 실행되는 문장
 			break;
 		} //switch
 
 - 기준값, 비교값(값1, 값2, 값N)은 정수형의 자료이여야 한다.
 - 
 */
