package chap18_io.sec02.exam01_inputstream_reed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("/Users/yoonsukkim/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2, 3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}

}
