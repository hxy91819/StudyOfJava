package com.hxy.enums59;
/**
 * ����ö��
 * enum������class��interface��ֻ����ϸ�ڱ�jdk�����
 * @author Administrator
 *
 */
public enum Coin {
	penny("hello"), nickel("world"), dime("welcome"), quarter("hello world");
	//ÿһ��ö���൱��һ�����������Ǹ��ݹ��췽��Coin�����õ�
	//��ζ���ö�����ڱ����ʱ���ȷ���ģ��޷��������ڼ��޸ġ�
	
	private String valueString;
	
	public String getValue(){
		return valueString;
	}
	
	private Coin(String valueString) {
		this.valueString = valueString;
	}
	
	public static void main(String[] args) {
		Coin coin = Coin.quarter;
		
		System.out.println(coin.getValue());
	}
}
