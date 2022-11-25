package worker;

public class TempEmployee extends Employee{
	int period;	//계약기간
	TempEmployee (String empNo, String name, String workType, int pay, int period) {
		super(empNo, name, workType, pay);
		this.period = period;
	}//TempEmployee
	
	int getMonthlyPay() {
		//비정규직 :  연봉/12
		return pay/12;
	}//getMonthlyPay
}//class
