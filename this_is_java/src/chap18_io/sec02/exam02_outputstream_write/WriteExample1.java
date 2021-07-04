package chap18_io.sec02.exam02_outputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("/Users/yoonsukkim/test.txt");
		byte[] data = "ABC".getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}

}
