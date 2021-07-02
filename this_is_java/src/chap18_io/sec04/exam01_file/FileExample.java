package chap18_io.sec04.exam01_file;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class FileExample {

	public static void main(String[] args) throws Exception {
		File dir = new File("/Users/yoonsukkim/temp/dir");
		File file1 = new File("/Users/yoonsukkim/temp/file1.txt");
		File file2 = new File("/Users/yoonsukkim/temp/file2.txt");
		File file3 = new File(new URI("file:///Users/yoonsukkim/temp/file3.txt"));
		
		if(dir.exists() == false) { dir.mkdir(); }
	}

}
