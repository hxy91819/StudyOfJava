package com.hxy.enums59;

public class EunmsTest1 {
	public static void main(String[] args) {
		Color myColor = Color.Blue;
		
		System.out.println(myColor);//ö��ֵ����
		
		System.out.println("-------------");
		
		for(Color color : Color.values()){//values����һ������
			System.out.println(color);
		}
	}
}
