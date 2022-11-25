public class Test_Method01 {
	public static void main(String[] args) {
		int num1 = 1, num2 = 50, num3 = 51, num4 = 100;	//인수(매개변수)값을 초기화
		getSum(num1, num2);			//1 ~ 50 누적합을 계산하는 메소드 호출 ▶ 실인수
		getSum(num3, num4);			//51 ~ 100 누적합을 계산하는 메소드 호출 ▶ 실인수
		getSum(num1, num4);			//1 ~ 100 누적합을 계산하는 메소드 호출 ▶ 실인수
	}//main()
	public static void getSum(int x, int y) {	//getSum() 메소드를 정의 ▶ 가인수
		int sum = 0;
		for(int i = x; i <= y; i++) {
			sum += i;		//snum = snum + i
		}//for
		System.out.println(x + "부터" + y + "까지의 누적합 : " + sum);
	}//getSum
	
	
}//class





/*
public class Test_Method01 {
	public static void main(String[] args) {
		// 1브타 50까지의 누적합(sum) : num1(1) ~ num2(50)
		int num1 = 1, num2 = 50;
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println(num1 + "부터" + num2 + "까지의 누적합 : " + sum);
		
		//51부터 100까지의 누적합(sum) : num3(51) ~ num4(100)
		int num3 = 51, num4 = 100;
		sum = 0;
		for(int i = num3; i <= num4; i++) {
			sum += i;
		}//for
		System.out.println(num3 + "부터" + num4 + "까지의 누적합 : " + sum);
	}//main()
}//class
*/