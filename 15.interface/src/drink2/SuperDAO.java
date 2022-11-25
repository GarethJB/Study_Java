package drink2;

import java.util.Scanner;

import drink.DrinkDTO;

public class SuperDAO {
	DrinkDTO[] drinks;
	Scanner sc;
		
	SuperDAO(DrinkDTO[] drinks, Scanner sc) {
		this.drinks = drinks;
		this.sc = sc;
	}
}
