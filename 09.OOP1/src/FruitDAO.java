import java.text.DecimalFormat;

public class FruitDAO {
	public void getPrice(FruitDTO[] fruit) {
		for (FruitDTO dto : fruit) {
			dto.setPrice(dto.getCost() * dto.getQty());
		}//for
	}//getPrice
	
	public void diplay(FruitDTO[] fruit) {
		DecimalFormat df = new DecimalFormat("￦#,##0");
		System.out.println("과일명" + "\t" + "단가" + "\t" + "수량" + "\t" + "가격");
		System.out.println("==============================");
		for (FruitDTO dto : fruit) {
			System.out.print(dto.getName() + "\t");
			System.out.print(df.format(dto.getCost()) + "\t");
			System.out.print(dto.getQty() + "\t");
			System.out.print(df.format(dto.getPrice()) + "\n");
		}
	}//display
}//class