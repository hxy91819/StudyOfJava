package com.hxy.enums59;
/**
 * ö��API�Ĳ���
 * @author hxy
 *
 */
public class ShowEnum {

	public static void main(String[] args){
		//System.out.println(OpConstant.valueOf(args[0]));
		enumCompareTo(OpConstant.valueOf(args[0]));
	}
	
	public static void enumCompareTo(OpConstant constant){
		System.out.println(constant);
		
		for(OpConstant c : OpConstant.values()){
			System.out.println(constant.compareTo(c));//�Ƚ�λ�ã�����λ�ò�
		}
	}
}
