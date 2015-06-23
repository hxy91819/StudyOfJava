package com.hxy.enums59;
/**
 * 复杂枚举
 * enum类似于class和interface，只不过细节被jdk完成了
 * @author Administrator
 *
 */
public enum Coin {
	penny("hello"), nickel("world"), dime("welcome"), quarter("hello world");
	//每一个枚举相当于一个对象，以上是根据构造方法Coin来调用的
	//如何定义枚举是在编译的时候就确定的，无法在运行期间修改。
	
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
