package com.hxy.enums59;

/**
 * ö�ٿ�����Ϊswich�Ĳ���
 * @author Administrator
 *
 */
public class EnumTest2 {
	public static void doOp(OpConstant opConstant){
		switch (opConstant) {//char byte int enum short
		case TURN_LEFT:
			System.out.println("����ת");
			break;
		case TURN_RIGHT:
			System.out.println("����ת");
			break;
		case SHOOT:
			System.out.println("���");
			break;
		default:
			System.out.println("ʲô������");
			break;
		}
	}
	
	public static void main(String[] args) {
		doOp(OpConstant.SHOOT);
		doOp(OpConstant.TURN_LEFT);
	}
}