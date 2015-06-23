package com.hxy.enums59;

/**
 * 枚举可以作为swich的参数
 * @author Administrator
 *
 */
public class EnumTest2 {
	public static void doOp(OpConstant opConstant){
		switch (opConstant) {//char byte int enum short
		case TURN_LEFT:
			System.out.println("向左转");
			break;
		case TURN_RIGHT:
			System.out.println("向右转");
			break;
		case SHOOT:
			System.out.println("射击");
			break;
		default:
			System.out.println("什么都不做");
			break;
		}
	}
	
	public static void main(String[] args) {
		doOp(OpConstant.SHOOT);
		doOp(OpConstant.TURN_LEFT);
	}
}