package com.hxy.staticimport_1_60;

import static com.hxy.staticimport_2_60.Common.AGE;
import static com.hxy.staticimport_2_60.Common.output;//��Ҫ�ĵ������ĳ�Ա�����ͷ���

/**
 * ��̬����
 * @author hxy
 *
 */
public class StaticImportTest2 {
	public static void main(String[] args) {
		int a = AGE;
		
		System.out.println(a);
		
		output();
	}
}
