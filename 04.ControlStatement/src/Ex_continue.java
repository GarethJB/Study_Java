public class Ex_continue {
	public static void main(String[] args) {
		//continue : 반복문에서 continue문 아래의 실행문을 실행하지 않고,
		//제어권을 반복문의 첫머리로 이동하는 명령어(키워드)
		
		//1부터 10까지의 정수중에서 홀수의 누적합(oddSum)을 구하시오 : for(반복), if(홀수판단)
		int oddSum = 0;						//결과가 저장될 변수를 초기화;
		for(int i = 1; i <= 10; i++) {		//반복변수 i를 1부터 10까지 증가하면서 반복
			if(i % 2 != 0) {				//i값이 홀수이면
				oddSum += i;				//홀수의 누적합 계산
			}//if
		}//for
		System.out.println("홀수의 누적합 : " + oddSum);
		
		//1부터 10까지의 정수중에서 홀수의 누적합(oddSum)을 구하시오 : for(반복), if(홀수판단), continue
		oddSum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}else {
				oddSum += i;
			}//if
		}//for
		System.out.println("홀수의 누적합 : " + oddSum);
	}//main
}//class
