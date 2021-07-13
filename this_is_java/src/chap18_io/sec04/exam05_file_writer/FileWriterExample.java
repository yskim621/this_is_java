package chap18_io.sec04.exam05_file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/yoonsukkim/temp/file.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		
		System.out.println("파일에 저장 되었습니다.");
	}

}
