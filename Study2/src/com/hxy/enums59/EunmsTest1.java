package com.hxy.enums59;

public class EunmsTest1 {
	public static void main(String[] args) {
		Color myColor = Color.Blue;
		
		System.out.println(myColor);//枚举值本身
		
		System.out.println("-------------");
		
		for(Color color : Color.values()){//values返回一个数组
			System.out.println(color);
		}
	}
}
