package io86;

import java.io.File;

public class FileTest4 {
	public static void main(String[] args) {
		File file = new File("E:/IdeaHealthProject");
		
//		String[] namesStrings = file.list();//ֻ��ȡ��һ�������
//		
//		for(String nameString : namesStrings){
//			System.out.println(nameString);
//		}
		
		File[] files = file.listFiles();//Ч����ͬ
		
		for(File file2 :files){
			System.out.println(file2.getParent() + "/" + file2.getName());
		}
	}
}
