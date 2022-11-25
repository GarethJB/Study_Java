package worker;

import java.text.DecimalFormat;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee hong = new RegularEmployee("20001", "홍길동", "정규직", 24000000, 10);
		employeeInfo(hong);
		
		Employee park = new TempEmployee("22001", "박문수", "비정규직", 24000000, 12);
		employeeInfo(park);
		
		
		Employee sim = new DailyEmployee("23001", "심청", "일용직", 200000, 5);
		employeeInfo(sim);
		
		
	}//main()
	
	static void employeeInfo(Employee who) {
		DecimalFormat df = new DecimalFormat("#,###,###,###");
		System.out.println("사번 : " + who.empNo);
		System.out.println("성명 : " + who.name);
		System.out.println("근로형태 : " + who.workType);
		System.out.println("월급여 : " + df.format(who.getMonthlyPay()) + "원");	
		// 정규직 직원의 보너스가 몇 %인지 보너스도 출력
		// 비정규직 직원의 근로계약기간이 몇 년인지 근로기간도 출력
		// 일용직 직원의 일당이 얼마인지 일당도 출력
		if(who instanceof RegularEmployee) {
			RegularEmployee regular = (RegularEmployee)who;				//downcast
			System.out.println("보너스 : " + regular.bonus + "%");
		} else if (who instanceof TempEmployee) {
			TempEmployee temp = (TempEmployee)who;
			System.out.println("근무기간 : " + temp.period + "개월");
		} else if  (who instanceof DailyEmployee) {
			DailyEmployee daily = (DailyEmployee)who;
			System.out.println("일당 : " + df.format(daily.pay) + "원");
		} else {
			System.out.println("당사 직원이 아닙니다.");
		}
		System.out.println();
	}//employeeInfo()
}//class
