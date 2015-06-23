package com.hxy.enumMap59;
/**
 * ö����ʵ�ʿ����е�Ӧ��
 * @author hxy
 *
 */
public class AccessControl {
	/**
	 * �ȽϺ���ķ��������ʹ��int����ô�޷�����ö��������������
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
		AccessRight accessRight = AccessRight.valueOf("MANAGER");//���ַ���ת��Ϊö������
		
		System.out.println(checkRight(accessRight));
		
		System.out.println(checkRight(AccessRight.EMPLOYEE));//һ��ĵ��÷���
	}
}
