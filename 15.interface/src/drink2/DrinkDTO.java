package drink2;

public class DrinkDTO {
	//음료명, 가격, 수량
	//private
	String name;	
	//private
	int price, quantity;
	
	DrinkDTO(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}//DrinkDTO
	
	public void setName(String name) {
		this.name = name;
	}//setName()
	
	public void setPrice(int price) {
		this.price = price;
	}//setPrice()
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}//setQuantity()
	
}
