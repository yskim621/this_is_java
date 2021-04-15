package chap11_java_api_document.verify.exam03;

public class StringConvertExample {

	public static void main(String[] args) {
		String strData1 = "200";
		int intdat1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2); // "" + intData2;
	}

}
