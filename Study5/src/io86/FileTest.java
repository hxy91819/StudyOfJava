package io86;

import java.io.File;
import java.io.IOException;

/**
 * File���޷����ļ�����д���ݡ�
 * @author hxy
 *
 */
public class FileTest {
	public static void main(String[] args) throws IOException  {
		// Linuxϵͳ�£�û���̷��ĸ��
		File file = new File("D:/" + File.pathSeparator + "myfile.txt");
		//Java�����е�IO�����϶����׳��쳣
		System.out.println(file.createNewFile());
		//File�༰����Ŀ¼���ִ����ļ���
	}
}
