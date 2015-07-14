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
		// Linux系统下，没有盘符的概念。
		File file = new File("D:/" + File.pathSeparator + "myfile.txt");
		//Java中所有的IO基本上都有抛出异常
		System.out.println(file.createNewFile());
		//File类及代表目录，又代表文件。
	}
}
