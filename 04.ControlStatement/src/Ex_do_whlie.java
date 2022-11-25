public class Ex_do_whlie {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 홀수의 누적합(whileOddSum)을 구하여 출력 : while, if
		int whileOddSum = 0;	//결과가 저장될 변수를 초기화
		
		int i = 1;					//초기값 : 1부터 시작
		while(i <= 100) {			//조건식 : 100까지 동작
			if(i % 2 != 0) {		//실행문 : 반복변수(i)의 값이 홀수이면
				whileOddSum += i;	//홀수의 누적합 계산
			}//if					//실행문 종료
			i++;					//증감값 : 1씩 증가
		}//while
		
		System.out.println("while 홀수의 합 : " + whileOddSum);
		
		//1부터 100까지의 정수 중에서 홀수의 누적합(doOddSum)을 구하여 출력
		int doOddSum = 0;
		
		i = 1;
		do {
			if(i % 2 != 0) {
				doOddSum += i;
			}//if
			i++;
		} while(i <= 100);
		
		System.out.println("do_while 홀수의 합 : " + doOddSum);
	}//main()
}//class

/*
 ○ do_while문 : 선처리 → 후조건 
 	▶ 조건이 처음부터 거짓이더라도 실행문(반복문)은 최소 1번은 실행
 	
 초기값;
 do{
 	실행문;
 	증감값;
 } while(조건식);
 */