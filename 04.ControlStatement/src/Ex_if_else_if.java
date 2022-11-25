public class Ex_if_else_if {
	public static void main(String[] args) {
		//점수(score)가 90이상이면 'A학점', 점수가 90 미만이면서 80 이상이면 'B학점'
		//점수가 70이상이면 C, 60이상이면 D
		
		int score = 87;
		System.out.println("점수 : " + score);
		
		if(score >= 90) {
			System.out.println("학점 : A");
		} else if(score >= 80) {
			System.out.println("학점 : B");
		} else if(score >= 70) {
			System.out.println("학점 : C");
		} else if(score >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}//if
		
		
		
	}//main()
}//class

/*
 ◆ 다중 if문 : 여러개의 조건을 판단하여, 해당 조건을 만족할 경우 실행
 
 if(조건식1){
 	조건식1이 참일 때 실행되는 문장;
 } else if(조건식2) {
 	조건식2가 참일 때 실행되는 문장;
 } else if(조건식N){
 	조건식N이 참일 때 실행되는 문장;
 } else{
 	거짓일 때 실행되는 문장;
 }//if
  
 */
 