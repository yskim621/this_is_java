package chap18_io.sec02.exam03_reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("/Users/yoonsukkim/test.txt");
		int readData;
//		while((readData=reader.read()) != -1) {
//			System.out.print((char)readData);
//		}
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		reader.close();
	}

}
