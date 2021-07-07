package chap18_io.sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("/Users/yoonsukkim/git/this_is_java/this_is_java/src/chap18_io/sec05/exam03_bufferedinputstream/forest.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("/Users/yoonsukkim/git/this_is_java/this_is_java/src/chap18_io/sec05/exam03_bufferedinputstream/forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 했을 때: " + (end-start) + "ms");
		bis.close();
		fis1.close();
		
	}

}
