package com.hxy.Decorator.sageExp;

/**
 * �仯������Ӧ���������ʥ���е�
 * 
 * ����װ�ν�ɫ
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
