public class GoodsInfo {
	String name, code, brand;
	int unitCost, discountRate;
	
	GoodsInfo(String name, String code, String brand, int unitCost) {
		this.name = name;
		this.code = code;
		this.brand = brand;
		this.unitCost = unitCost;
	}//GoodsInfo()
	
	GoodsInfo(String name, String code, String brand, int unitCost,int discountRate) {
		this.name = name;
		this.code = code;
		this.brand = brand;
		this.unitCost = unitCost;
		this.discountRate = discountRate;
	}//GoodsInfo()
	
	int setdiscountRate(int discountRate) {
		this.discountRate = discountRate;
		return discountRate;
	}//setdiscountRate()
	
	int getPrice() {
		return unitCost * (100 - discountRate) / 100;
	}//getPrice()
}//class
