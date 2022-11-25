package ex02;

public class DataControl {
		DataDAO dao;
	
	public void insert() {
		dao = new InsertDAO();		// 다형성에 의해서 부모의 타입으로 표현할 수 있다
		dao.insert();
	}
	public void list() {
		dao = new ListDAO();
		dao.list();
	}
	public void update() {
		dao = new UpdateDAO();
		dao.update();
	}
	public void delete() {
		dao = new DeleteDAO();
		dao.delete();		
	}
}//class
