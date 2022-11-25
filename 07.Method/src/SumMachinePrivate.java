import java.util.Scanner;

public class SumMachinePrivate {
	//시작값(startNum)과 종료값(endNum)을 입력받은 후,
	//makeSum() 메소드를 호출하고 결과값을 출력
	//단, makeSum() 메소드는 SumMachine.java, SumMachineReturn.java 클래스를 활용
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작값을 입력하세요 : ");
		int startNum =  Integer.parseInt(scanner.nextLine());
		System.out.print("종료값을 입력하세요 : ");
		int endNum =  Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		//SumMachine.java 활용
		//① makeSum() 메소드에 static 있다 : 클래스명.static메소드명() ▶ SumMachine.makeSum();
		//SumMachine.makeSum(startNum, endNum);
		
		//② makeSum() 메소드에 static 없다 :  객체를 생성하여 메소드를 호출
		SumMachine sm = new SumMachine();					//SumMachine 객체 생성
		sm.makeSum(startNum, endNum);						//makeSum() 메소드 호출
		//public ~~ makeSum() : 접근제어자가 public 선언 ▶ 외부에서도 사용(접근) 가능
		
		//SumMachineReturn.java 활용
		SumMachineReturn smr = new SumMachineReturn();		//SumMachineReturn 객체 생성
		//System.out.println("누적합 : " + smr.makeSum(startNum, endNum));	//오류
		//private ~~ makeSum() : 접근제어자가 private 선언 ▶ 내부에서만 사용(접근) 가능 : 정보은닉
 	}//main()
}//class
