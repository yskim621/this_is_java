package chap18_io.sec04.exam01_file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		File dir = new File("/Users/yoonsukkim/temp/dir");
		File file1 = new File("/Users/yoonsukkim/temp/file1.txt");
		File file2 = new File("/Users/yoonsukkim/temp/file2.txt");
		File file3 = new File(new URI("file:///Users/yoonsukkim/temp/file3.txt"));
		
		if(dir.exists() == false) { dir.mkdir(); }
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		File temp = new File("/Users/yoonsukkim/temp");
		File[] contents = temp.listFiles();
		System.out.println("날짜          시간                 형태            크기     이름  ");
		System.out.println("---------------------------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(new Date(file.lastModified()));
			if(file.isDirectory()) {
				System.out.println("\t<Dir>\t\t\t" + file.getName());
			} else {
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}

}
