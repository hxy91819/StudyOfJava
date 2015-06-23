package com.hxy.staticimport_1_60;

import static com.hxy.staticimport_2_60.Common.AGE;
import static com.hxy.staticimport_2_60.Common.output;//需要的倒入具体的成员变量和方法

/**
 * 静态导入
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
