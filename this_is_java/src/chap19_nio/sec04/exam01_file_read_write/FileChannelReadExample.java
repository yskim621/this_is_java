package chap19_nio.sec04.exam01_file_read_write;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelReadExample {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("/Users/yoonsukkim/temp/file.txt");
		
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(100);
		
		Charset charset = Charset.defaultCharset();
		String data = "";
		int byteCount;
		
		while(true) {
			byteCount = fileChannel.read(byteBuffer);
			if(byteCount == -1) break;
			byteBuffer.flip();
			data += charset.decode(byteBuffer);
			byteBuffer.clear();
			
		}
		
		fileChannel.close();
		
		System.out.println("file.txt: " + data);
	}

}
