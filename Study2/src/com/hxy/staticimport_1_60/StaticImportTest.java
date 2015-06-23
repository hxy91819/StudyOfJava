package com.hxy.staticimport_1_60;

import com.hxy.staticimport_2_60.Common;

/**
 * Old Ways
 * @author hxy
 *
 */
public class StaticImportTest {
	public static void main(String[] args) {
		int a = Common.AGE;
		
		System.out.println(a);
		
		Common.output();
	}
}
