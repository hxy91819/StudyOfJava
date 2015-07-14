package io86;

import java.io.File;
import java.io.IOException;

public class FileTest5 {
	public static void main(String[] args) {
		File file = new File("E:\\test\\xyz\\abc.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		file.delete();
	}
}
