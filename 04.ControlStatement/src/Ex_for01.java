public class Ex_for01 {
	public static void main(String[] args) {
		//정수 0부터 10까지 출력하시오.
		
		for(int i = 0; i <= 10; i++) { //반복변수 i를 0부터 10까지 1씩 증가하면서 반복
			System.out.println(i);
		}//for
		System.out.println("====");
		//0부터 10까지의 정수 중에서 짝수만 출력 : for
		for(int i = 0; i <=10; i = i +2) {	//반복변수 i를 0부터 10까지 2씩 증가하면서 반복 : i += 2
			System.out.println(i);			//i값을 출력
		}//for
		
		System.out.println("====");
		
		//0부터 10까지의 정수 중에서 짝수만 출력 : for(반복), if(짝수판단)
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}//if
		}//for
	}//main()
}//class

/*
 ◆ 반복문(순환문, Loop문)
 	- for문 : 반복횟수를 알고 있을 때 사용, 가장 많이 사용
 	- while문 : 반복횟수를 모를 경우 사용, 선조건 후처리
 	- do~while문 : 최소 한번은 반복해야할 경우, 선처리 후조건
 	
 ◆ for문
 	 for(초기문(시작값); 조건문(최종값); 반복후작업(증감값)){
 	 	반복할 문장(실행문);
 	 }//for
 */