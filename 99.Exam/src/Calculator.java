public class Calculator {
	public static int getAdd(int num1, int num2) {	
		int add = num1 + num2;
		return add;
	}//getAdd
	
	public static int getSub(int num1, int num2) {	
		int sub = num1 - num2;
		return sub;
	}//getSub
	
	public static int getMul(int num1, int num2) {	
		int mul = num1 * num2;
		return mul;
	}//getMul
	
	public static int getDiv(int num1, int num2) {	
		int div = num1 / num2;
		return div;
	}//getDiv
	
	public void display(int num1, int num2, int add, int sub, int mul, int div) {
		System.out.println("첫 번째 정수 : " + num1);
		System.out.println("두 번째 정수 : " + num2);
		System.out.println("덧셈 : " + getAdd(num1, num2));
		System.out.println("뺄셈 : " + getSub(num1, num2));
		System.out.println("곱셈 : " + getMul(num1, num2));
		System.out.println("나눗셈 : " + getDiv(num1, num2));
	}
}//class
