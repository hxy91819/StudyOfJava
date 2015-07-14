package com.hxy.Decorator.sageExp;

/**
 * 是“齐天大圣”的猴子
 * 
 * 具体构件角色
 * 
 * @author hxy
 *
 */
public class Monkey implements TheGreatestSage {

   @Override
   public void say() {
      System.out.println("I'm TheGreatestSage!");
   }

}
