package com.hxy.jdk5new37;

/**
 * �ɱ��������
 * �ɱ�������������һ������λ�ó���
 * @author Administrator
 *
 */
public class VarargsTest {
	/**
	 * ���
	 * @param nums
	 * @return
	 */
	private static int sum(int... nums){
		int sum = 0;
		for(int num : nums){
			sum += num;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int result = sum(1, 2);
		
		System.out.println(result);
		
		result = sum(1,2,3,4,5,6);
		
		System.out.println(result);
		
		result = sum(new int[]{1,2,3,4});//�����Ͼ���һ������
		
		System.out.println(result);
	}
}
