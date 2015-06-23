package com.hxy.enumMap59;
/**
 * 枚举在实际开发中的应用
 * @author hxy
 *
 */
public class AccessControl {
	/**
	 * 比较合理的方法，如果使用int，那么无法避免枚举以外的情况传入
	 * @param accessRight
	 * @return
	 */
	public static boolean checkRight(AccessRight accessRight){
		switch (accessRight) {
		case MANAGER:
			return true;
		case DEPARTMENT:
			return false;
		case EMPLOYEE:
			return false;
		default:
			return false;
		}
	}
	
	public static void main(String[] args) {
		AccessRight accessRight = AccessRight.valueOf("MANAGER");//将字符串转换为枚举类型
		
		System.out.println(checkRight(accessRight));
		
		System.out.println(checkRight(AccessRight.EMPLOYEE));//一般的调用方法
	}
}
