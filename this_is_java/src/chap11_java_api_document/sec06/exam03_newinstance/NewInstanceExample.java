package chap11_java_api_document.sec06.exam03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			//Class clazz = Class.forName("chap11.sec06.exam03_newinstance.SendAction");
			Class clazz = Class.forName("chap11.sec06.exam03_newinstance.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
