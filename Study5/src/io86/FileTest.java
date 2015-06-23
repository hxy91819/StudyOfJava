package io86;

import java.io.File;
import java.io.IOException;

/**
 * File类无法向文件里面写内容。
 * @author hxy
 *
 */
public class FileTest {
	public static void main(String[] args) throws IOException  {
		File file = new File("D:\\myfile.txt");
		//Java中所有的IO基本上都有抛出异常
		System.out.println(file.createNewFile());
	}
}
