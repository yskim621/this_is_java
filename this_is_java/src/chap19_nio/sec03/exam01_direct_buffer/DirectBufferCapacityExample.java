package chap19_nio.sec03.exam01_direct_buffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class DirectBufferCapacityExample {

	public static void main(String[] args) {
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
		System.out.println("저장 용량: " + byteBuffer.capacity() + "byte");
		
		CharBuffer charBuffer = ByteBuffer.allocateDirect(100).asCharBuffer();
		System.out.println("저장 용량: " + charBuffer.capacity() + "byte");
		
		IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer();
		System.out.println("저장 용량: " + intBuffer.capacity() + "byte");
	}

}
