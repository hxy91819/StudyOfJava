package com.hxy.Decorator.sageExp;

/**
 * 变化法术，应该是齐天大圣具有的
 * 
 * 抽象装饰角色
 * @author hxy
 *
 */
public class ChangeMagic implements TheGreatestSage {
   private TheGreatestSage sage;
   
   public ChangeMagic(TheGreatestSage sage){
       this.sage = sage;
   }
   
   @Override
   public void say() {
      sage.say();
   }

}
