package com.hxy.enumMap59;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
	public static void main(String[] args) {
		Map<Action, String> map = new EnumMap<Action, String>(Action.class);//key可以传入枚举
		
		
		map.put(Action.TURN_RIGHT, "向右转");
		map.put(Action.SHOOT, "射击");
		map.put(Action.TURN_LEFT, "向左转");
		
		for(Action action : Action.values()){
			System.out.println(map.get(action));//Action是有顺序的，打印的结果按照枚举定义的顺序
		}
	}
}

enum Action{
	TURN_LEFT, TURN_RIGHT, SHOOT;
}
