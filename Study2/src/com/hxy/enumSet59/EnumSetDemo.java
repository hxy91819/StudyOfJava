package com.hxy.enumSet59;

import java.util.EnumSet;
import java.util.Iterator;

enum FontConstant {
	Plain, Bold, Italilc, Hello
}

public class EnumSetDemo {
	public static void showEnumSet(EnumSet<FontConstant> enumSet) {
		for(Iterator<FontConstant> iterator = enumSet.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
		
	}
	public static void main(String[] args) {
		EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain, FontConstant.Bold);//����ѡ�е�ö�٣�����һ��Set
		
		showEnumSet(enumSet);
		
		System.out.println("-----------------------");
		
		showEnumSet(EnumSet.complementOf(enumSet));//��ȡ����enumset�����������һ��EnumSet
		
	}
}
