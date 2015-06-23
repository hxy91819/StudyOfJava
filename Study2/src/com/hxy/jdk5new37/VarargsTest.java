package com.hxy.jdk5new37;

/**
 * 可变参数测试
 * 可变参数必须在最后一个参数位置出现
 * @author Administrator
 *
 */
public class VarargsTest {
	/**
	 * 求和
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
		
		result = sum(new int[]{1,2,3,4});//本质上就是一个数组
		
		System.out.println(result);
	}
}
