package drink2;

import java.util.Scanner;

public class DataControl extends SuperDAO{
	DataControl(drink.DrinkDTO[] drinks, Scanner sc){
		super(drinks, sc);
	}
	DrinkDAO dao;
	
	void insert() {
		dao = new InsertDAO(drinks, sc);
		dao.insert();
	}
	void list() {
		dao = new ListDAO(drinks, sc);
		dao.list();
	}
	void update() {
		dao = new UpdateDAO(drinks, sc);
		dao.update();
	}
	void delete() {
		dao = new DeleteDAO(drinks, sc);
		dao.delete();
	}
}
