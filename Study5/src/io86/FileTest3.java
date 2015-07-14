package io86;

import java.io.File;

public class FileTest3 {
	public static void main(String[] args) {
		File file = new File("E:/test/xyz/mkdir");
		
//		System.out.println(file.mkdir());//只能创建最底层的目录，必须一级一级创建。
		
		System.out.println(file.mkdirs());//可以创建所有的路径，已经存在的无法创建，返回false
		
		System.out.println(file.isDirectory());//判断是否是路径
		
		System.out.println(file.isFile());
	}
}
