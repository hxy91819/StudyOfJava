package com.hxy.Decorator.sageExp;

/**
 * 变化成鱼儿，应该属于变化法术
 * 
 * 具体装饰角色
 * @author hxy
 *
 */
public class FishChange extends ChangeMagic {
   public FishChange(TheGreatestSage sage){
      super(sage);
   }
   
   @Override
   public void say() {
      super.say();
      System.out.println("Now I'm a fish, I used FishChangeMagic!");//装饰
   }
}
