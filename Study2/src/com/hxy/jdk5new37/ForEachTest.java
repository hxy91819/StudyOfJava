package com.hxy.jdk5new37;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

/**
 * ��ǿ��forѭ������C#��foreach
 * @author Administrator
 *
 */
public class ForEachTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		//old ways
		for(int i = 0; i < arr.length; i ++){
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------");
		
		//new ways
		for(int element : arr){
			System.out.println(element);
		}
		
		System.out.println("---------------");
		
		String[] names = {"hello", "world", "extra", "aaa"};
		
		for(String name : names){
			System.out.println(name);
		}
		
		System.out.println("---------------");
		
		//��ά����
		int[][] arrDouble = {
				{1,2,3},
				{4,5,6},
				{7,8,9,0}
		};
		for(int[] row : arrDouble){
			for(int element : row){
				System.out.println(element);
			}
		}
		
		System.out.println("---------------");
		
		//����
		Collection<String> col = new ArrayList<String>();//��̬��
		col.add("one");
		col.add("two");
		col.add("hello");
		
		for(String str: col){
			System.out.println(str);
		}
		
		System.out.println("---------------");
		System.out.println("---------------");
		System.out.println("---------------");
		
		//�������ϵ��ܽ�
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		for(int i = 0; i < list.size(); i ++){
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------");
		
		for(Iterator<String> iterator = list.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
		
		System.out.println("---------------");
		
		for(String str: list){//������
			System.out.println(str);
		}
		
		//ȱ�㣺ʧȥ����������Ϣ��
	}
}
