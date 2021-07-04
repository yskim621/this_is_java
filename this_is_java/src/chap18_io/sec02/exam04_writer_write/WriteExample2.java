package chap18_io.sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("/Users/yoonsukkim/test.txt");
		char[] data = "홍길동".toCharArray();
		writer.write(data);
		
		writer.flush();
		writer.close();
	}

}
