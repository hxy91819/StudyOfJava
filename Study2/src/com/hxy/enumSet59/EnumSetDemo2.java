package com.hxy.enumSet59;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo2 {
	//打印EnumSet
	public static void showEnumSet(EnumSet<FontConstant> enumSet){
		for(Iterator<FontConstant> iterator = enumSet.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		EnumSet<FontConstant> enumSet = EnumSet.noneOf(FontConstant.class);//指定只能传入FontConstant类型的。
		
		enumSet.add(FontConstant.Bold);
		enumSet.add(FontConstant.Italilc);
		enumSet.add(FontConstant.Hello);
		
		showEnumSet(enumSet);
	}
}
