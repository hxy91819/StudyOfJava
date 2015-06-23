package com.hxy.jdk5new37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 自动装箱、拆箱测试
 * 使用新特性完成main方法参数频率统计（改写之前的方法）
 * @author Administrator
 *
 */
public class BoxingTest {
	public static void main(String[] args) {
//		int a = 3;
//		
//		Collection<Integer> c = new ArrayList<Integer>();
//		
//		c.add(a);//自动装箱：将int类型的3转换为Integer类型并放到集合当中
//		c.add(new Integer(a));//原方法
//		
//		for(Integer i : c){
//			System.out.println(i);
//		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String eleString : args){
//			if(map.get(eleString) == null){
//				map.put(eleString, 1);
//			}
//			else{
//				Integer integer = map.get(eleString);
//				integer = integer + 1;
//				map.put(eleString, integer);
//			}
			//进阶方法
			Integer freq = map.get(eleString);
			map.put(eleString, (null == freq) ? 1 : map.get(eleString) + 1);
		}
		
		Set<String> set = map.keySet();
		
		for(String eleString: set){
			System.out.println(map.get(eleString) + " " + eleString);
		}
	}
}
