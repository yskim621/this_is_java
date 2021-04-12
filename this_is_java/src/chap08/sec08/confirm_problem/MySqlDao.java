package chap08.sec08.confirm_problem;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySQL DB에서 조회");		
	}

	@Override
	public void insert() {
		System.out.println("MySQL DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySQL DB에 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySQL DB에 삭제");
	}

}
