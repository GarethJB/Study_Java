public class Test_Array04 {
	public static void main(String[] args) {
		/*
		 ○ 비정방형 배열을 이용한 별찍기
		 	★
		 	★★
		 	★★★
		 	★★★★
		 	★★★★★
		 */
		
		String[][] star = new String[10][];		//5행짜리 비정방형 배열 선언 및 생성
		/*
		star[0] = new String[1];				//index 0번째 행의 열을 생성(1열)
		star[0] = new String[2];				//index 1번째 행의 열을 생성(2열)
		star[0] = new String[3];				//index 2번째 행의 열을 생성(3열)
		star[0] = new String[4];				//index 3번째 행의 열을 생성(4열)
		star[0] = new String[5];				//index 4번째 행의 열을 생성(5열)
		*/
		for (int i = 0; i < star.length; i++) {
			star[i] = new String[i + 1];		//star[i] = new String[star.length - i]; ▶ 역방향
		}//for
		
		//각각의 요소에 '★'을 할당 후 출력
		
		for (int i = 0; i < star.length; i++) {			//star.length : 5 ▶ 행(rwo)
			for (int j = 0; j < star[i].length; j++) {		//star[i].length : ? ▶ 열(column)
				star[i][j] = "★";
				System.out.print(star[i][j]);
			}//for j
			System.out.println();
		}//for i
		
	}//main()
}//class
