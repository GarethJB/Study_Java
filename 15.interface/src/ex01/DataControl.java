package ex01;

public class DataControl implements DataDAO{
	DeleteDAO dao = new DeleteDAO();
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		dao.insert();							//InsertDAO 의 메소드가 호출
	}//insert()

	@Override
	public void list() {
		// TODO Auto-generated method stub
		dao.list();								//ListDAO 의 메소드가 호출
	}//list()

	@Override
	public void update() {
		// TODO Auto-generated method stub
		dao.update();							//UpdateDAO 의 메소드가 호출
	}//update()

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		dao.delete();							//DeleteDAO 의 메소드가 호출
	}//delete()

}//class
