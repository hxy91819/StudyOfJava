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
		File file = new File("D:\\myfile.txt");
		//Java�����е�IO�����϶����׳��쳣
		System.out.println(file.createNewFile());
	}
}
