package io86;

import java.io.File;

public class FileTest3 {
	public static void main(String[] args) {
		File file = new File("E:/test/xyz/mkdir");
		
//		System.out.println(file.mkdir());//ֻ�ܴ�����ײ��Ŀ¼������һ��һ��������
		
		System.out.println(file.mkdirs());//���Դ������е�·�����Ѿ����ڵ��޷�����������false
		
		System.out.println(file.isDirectory());//�ж��Ƿ���·��
		
		System.out.println(file.isFile());
	}
}
