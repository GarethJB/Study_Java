package worker;

public class DailyEmployee extends Employee {
	int workDays;
	DailyEmployee(String empNo, String name, String workType, int pay, int workDays) {
		super(empNo, name, workType, pay);
		this.workDays = workDays;
	}//DailyEmployee
	
	int getMonthlyPay() {
		//일용직 : 근무일수*일당
		return workDays * pay;
	}//getMonthlyPay()
}//class
