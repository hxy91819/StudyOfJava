package io86;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileTest6 {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\test\\xyz\\");
		
		file.mkdir();
		
		//生成文件
//		for(int i = 0; i < 100; i++){
//			String filename = i + ".txt";
//			
//			File fileForCreate = new File(file, filename);
//			
//			fileForCreate.createNewFile();
//		}
		
		//找出所有的java文件
		String[] namesStrings = file.list(new FilenameFilter() {
			//内部类，策略模式
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith(".java")){
					return true;
				}
				return false;
			}
		});
//		for(String nameString : namesStrings){
//			if(nameString.endsWith(".java")){
//				System.out.println(nameString);
//			}
//		}
		for(String nameString: namesStrings){
			System.out.println(nameString);
		}
	}
}
