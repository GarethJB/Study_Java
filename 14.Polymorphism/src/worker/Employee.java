package worker;

abstract public class Employee {
// 사번, 이름, 급여, 근로형태
	String empNo, name, workType;
	int pay;
	
	Employee(String empNo, String name, String workType, int pay) {
		this.empNo = empNo;
		this.name = name;
		this.workType = workType;
		this.pay = pay;
	}//Employee
	
// 급여를 계산한다
// 근로의 형태(정규직, 비정규직, 일용직)에 따라 월급여의 산출처리가 달라진다
	abstract int getMonthlyPay();
}//class
