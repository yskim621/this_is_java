package chap18_io.sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/yoonsukkim/temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassC classC = new ClassC();
		classC.field1 = 1;
		
		oos.writeObject(classC);
		oos.flush();
		oos.close();
		fos.close();
	}

}
