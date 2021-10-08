package chap18_io.sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("/Users/yoonsukkim/temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		System.out.println(classC.field1);
		
		ois.close();
		fis.close();
	}

}
