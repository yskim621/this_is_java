package chap18_io.sec04.exam02_fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {

	public static void main(String[] args) throws Exception  {
		FileInputStream fis = new FileInputStream("/Users/yoonsukkim/git/this_is_java/this_is_java/src/chap18_io/sec04/exam02_fileinputstream/FileInputStreamExample.java");
		int data;
		while( (data = fis.read()) != -1) {
			System.out.write(data);
		}
		System.out.flush();
		fis.close();
	}

}
