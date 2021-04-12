package chap08.sec08.confirm_problem;

public class DaoExample {
	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbwork(new OracleDao());
		System.out.println();
		dbwork(new MySqlDao());
	}

}
