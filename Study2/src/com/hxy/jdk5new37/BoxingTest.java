package com.hxy.jdk5new37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * �Զ�װ�䡢�������
 * ʹ�����������main��������Ƶ��ͳ�ƣ���д֮ǰ�ķ�����
 * @author Administrator
 *
 */
public class BoxingTest {
	public static void main(String[] args) {
//		int a = 3;
//		
//		Collection<Integer> c = new ArrayList<Integer>();
//		
//		c.add(a);//�Զ�װ�䣺��int���͵�3ת��ΪInteger���Ͳ��ŵ����ϵ���
//		c.add(new Integer(a));//ԭ����
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
			//���׷���
			Integer freq = map.get(eleString);
			map.put(eleString, (null == freq) ? 1 : map.get(eleString) + 1);
		}
		
		Set<String> set = map.keySet();
		
		for(String eleString: set){
			System.out.println(map.get(eleString) + " " + eleString);
		}
	}
}
