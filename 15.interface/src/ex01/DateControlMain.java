package ex01;

public class DateControlMain {
	public static void main(String[] args) {
		DataControl control = new DataControl();
		//CRUD
		control.insert();		//Create
		control.list();			//Read
		control.update();		//Update
		control.delete();		//Delete
	}//main()
}//class
