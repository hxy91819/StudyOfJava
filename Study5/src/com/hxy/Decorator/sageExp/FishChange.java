package com.hxy.Decorator.sageExp;

/**
 * �仯�������Ӧ�����ڱ仯����
 * 
 * ����װ�ν�ɫ
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
      System.out.println("Now I'm a fish, I used FishChangeMagic!");//װ��
   }
}
