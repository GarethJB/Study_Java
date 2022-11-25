public class Test_for03 {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 홀수의 합(oddSum)과 짝수의 합(evenSum)을 출력
		//for(반복), if(홀수와 짝수의 판단)
		int oddSum = 0;		
		int evenSum = 0;
		
		for(int i = 1; i <= 100; i++) {		//반복변수 i를 1부터 100까지 1씩 증가하면서 반복
			if(i % 2 == 1) {				//홀수이면
				oddSum += i;				//홀수의 누적합 계산
			} else {						//짝수이면
				evenSum += i;				//짝수의 누적합 계산
			}
		}//for
		
		System.out.println("홀수의 누적합 : " + oddSum);
		System.out.println("짝수의 누적합 : " + evenSum);
		
	}
}
