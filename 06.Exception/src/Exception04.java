import java.util.Iterator;

public class Exception04 {
	public static void main(String[] args) {
		//1부터 100까지의 누적합(sum)을 구하여 출력하시오 : 
		//단, 누적합이 906 이상이 되면, 계산을 중지하고 결과를 출력 : if(조건), break(중지)
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i; // sum = sum + i;
			if(sum >= 906) {
				System.out.println("누적합이 906 이상이 되었습니다");
				System.out.println("누적합 : "+sum+" , i값 : "+i+"");
				break;
			}//if
			
		}//for
		
		//try ~ catch 블럭을 이용하여 예외처리 하시오 ▶ throw
		//throw : 강제로 예외를 발생시켜 catch 블럭으로 예외를 던진다(넘긴다)
		
		try {
			int total = 0;
			for(int i = 1; i <= 100; i++) {
				total += i;
				if(total >= 906) {	
					System.out.println("누적합 : "+total+" , i값 : "+i+"");
					throw new Exception("누적합이 906 이상이 되었습니다.");
				}//if
			}//for
		} catch (Exception e) {
			e.printStackTrace();	// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}//main()
}//class
