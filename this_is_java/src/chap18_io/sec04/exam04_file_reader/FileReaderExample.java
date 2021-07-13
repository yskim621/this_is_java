package chap18_io.sec04.exam04_file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("/Users/yoonsukkim/git/this_is_java/this_is_java/src/chap18_io/sec04/exam04_file_reader/FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while( (readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		fr.close();
	}

}
