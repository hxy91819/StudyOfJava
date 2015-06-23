package com.hxy.enumSet59;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo2 {
	//��ӡEnumSet
	public static void showEnumSet(EnumSet<FontConstant> enumSet){
		for(Iterator<FontConstant> iterator = enumSet.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		EnumSet<FontConstant> enumSet = EnumSet.noneOf(FontConstant.class);//ָ��ֻ�ܴ���FontConstant���͵ġ�
		
		enumSet.add(FontConstant.Bold);
		enumSet.add(FontConstant.Italilc);
		enumSet.add(FontConstant.Hello);
		
		showEnumSet(enumSet);
	}
}
