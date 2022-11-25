import java.util.Scanner;

public class SumMachineReturn {
	//시작값(startNum)과 종료값(endNum)을 입력받은 후,
	//시작값부터 종료값까지의 누적합을 구하고 리턴받는 메소드를 호출 : makeSum()
	//결과값(sum)을 리턴받아 출력하시오.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작값을 입력하세요 : ");
		int startNum =  Integer.parseInt(scanner.nextLine());
		System.out.print("종료값을 입력하세요 : ");
		int endNum =  Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		System.out.println("시작값 : " + startNum);
		System.out.println("종료값 : " + endNum);
		//System.out.println("누적합 : " + makeSum(startNum, endNum));
		SumMachineReturn smr = new SumMachineReturn();
		System.out.println("누적합 : " + smr.makeSum(startNum, endNum));	//메소드 호출
	}//main()
	
	//시작값부터 종료값까지 누적합(sum)을 구하고 리턴하는 메소드를 정의
	public int makeSum(int startNum, int endNum) {	//static 제거
		int sum = 0;
		for(int i = startNum; i <= endNum; i++) {
			sum += i;
		}//for
		return sum;
	}//makeSum
}//class
