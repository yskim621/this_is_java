package chap09_nested_class.sec04.exam01_nestedInterface;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
