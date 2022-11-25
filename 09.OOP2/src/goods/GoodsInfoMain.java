package goods;

public class GoodsInfoMain {
	public static void main(String[] args) {
		
		
		GoodsInfo[] goods = new GoodsInfo[3];
		goods[0] = new GoodsInfo("운동화", "AD01", "나이키", 70000);
		goods[1] = new GoodsInfo("모자", "NK01", "아디다스", 30000);
		goods[2] = new GoodsInfo("티셔츠", "JD251", "오베이", 59000);
		
		display(goods);
		
	}//main()
	static void display(GoodsInfo[] goods) {
		System.out.printf("상품명 상품코드 브랜드 단가 할인율 판매가\n");
		for (int i = 0; i < goods.length; i++) {
			System.out.printf("%s %s %s %d %d %d \n"
					,goods[i].name, goods[i].code, goods[i].brand, goods[i].unitCost, goods[i].discountRate, goods[i].getPrice());
		}
		
		System.out.println("\n" + "=== foreach문 사용 ===");
		for (GoodsInfo good : goods) {
				System.out.printf("%s %s %s %d %d %d \n"
						,good.name, good.code, good.brand, good.unitCost, good.discountRate, good.getPrice());			
		}
	}//display()
}//class
