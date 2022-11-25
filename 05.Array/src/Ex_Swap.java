public class Ex_Swap {
	public static void main(String[] args) {
		//Swap(교환) : 기본 데이터 타입(ODT), 배열(Array)
		int num1 = 10;
		int num2 = 20;
		System.out.println("교환전 : num1 = "+num1+", num2 = "+num2+"");
		
		//num1과 num2의 값을 교환하여 출력하시오.
		
		int temp = num1;	//기존의 num1 값을 저장할 임시변수(temp)를 선언하고 num1의 값을 할당하여 초기화
		num1 = num2;		//변수 num2의 값을 변수 num1에 재할당
		num2 = temp;		//임시변수 temp의 값을 변수 num2에 재할당
		System.out.println("교환후 : num1 = "+ num1 +" , num2 = "+ num2 +"");
		
		
	}//main()
}//class
