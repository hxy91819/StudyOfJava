package com.hxy.jdk5new37;

/**
 * Integer����һ�����棬���Ỻ�����-128~127֮���������
 * @author Administrator
 *
 */
public class BoxTest2 {
	public static void main(String[] args) {
		Integer i1 = 100;
		Integer i2 = 100;
		
		if(i1 == i2){
			System.out.println("=");
		}else if(i1 != i2){
			System.out.println("!");
		}
		
		System.out.println("------------------");
		
		Integer i3 = 200;
		Integer i4 = 200;
		
		if(i3 == i4){
			System.out.println("=");
		}else if(i3 != i4){
			System.out.println("!");
		}
		
		System.out.println("---------------------");
		
		int i5 = 200;
		int i6 = 200;
		
		if(i5 == i6){
			System.out.println("=");
		} else if (i5 != i6){
			System.out.println("!");
		}
	}
}
