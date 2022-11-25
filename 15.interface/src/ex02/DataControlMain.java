package ex02;

public class DataControlMain {
	public static void main(String[] args) {
		DataControl control = new DataControl();
		//CRUD
		control.insert();		//Create
		control.list();			//Read
		control.update();		//Update
		control.delete();		//Delete
	}//main()
}//class
