package io86;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		//��Ҫ��ĳ��Ŀ¼�´����ļ������Ŀ¼������ڡ�
		File file = new File("E:/test");
		
		File file2 = new File(file, "xyz/hello.txt");
		
		File file3 = new File("E:/test", "xyz/file3.txt");
		
		try {
			file2.createNewFile();
			file3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
