package worker;

public class RegularEmployee extends Employee{
	int bonus;	//연봉의 10%의 형태
	
	RegularEmployee(String empNo, String name, String workType, int pay, int bonus) {
		super(empNo, name, workType, pay);
		this.bonus = bonus;
	}//RegularEmployee
	
	int getMonthlyPay() {
		//정규직은 (연봉+보너스)/12 
		return (int)(pay * (1 + bonus * 0.01) / 12);
	}//getMonthlyPay
}//class
