package com.hxy.Decorator.sageExp;

public class BirdChange extends ChangeMagic {

   public BirdChange(TheGreatestSage sage) {
      super(sage);
   }
   @Override
   public void say() {
      super.say();
      System.out.println("I'm a bird~");
   }
}
