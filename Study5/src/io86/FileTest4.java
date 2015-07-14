package io86;

import java.io.File;

public class FileTest4 {
	public static void main(String[] args) {
		File file = new File("E:/IdeaHealthProject");
		
//		String[] namesStrings = file.list();//只获取第一层的数据
//		
//		for(String nameString : namesStrings){
//			System.out.println(nameString);
//		}
		
		File[] files = file.listFiles();//效果相同
		
		for(File file2 :files){
			System.out.println(file2.getParent() + "/" + file2.getName());
		}
	}
}
