package com.hxy.enumSet59;

import java.util.ArrayList;
import java.util.List;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo3 {
	//打印EnumSet
	public static void showEnumSet(EnumSet<FontConstant> enumSet){
		for(Iterator<FontConstant> iterator = enumSet.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		List<FontConstant> list = new ArrayList<FontConstant>();
		
		list.add(FontConstant.Bold);
		list.add(FontConstant.Italilc);
		list.add(FontConstant.Plain);
		
		showEnumSet(EnumSet.copyOf(list));//将集合中的元素拷贝到一个枚举集合中。
	}
}
