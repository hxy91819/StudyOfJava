package com.hxy.Decorator.sageExp;

public class Client {
   public static void main(String[] args) {
      TheGreatestSage sage = new Monkey();
      
      FishChange fish = new FishChange(sage);//���ѣ����ӱ�����㣬��ʱ�Ⱦ߱����ӵĹ��ܣ��־߱���Ĺ��ܡ�
      
      fish.say();//͸����װ��ģʽ
      
      //�����FishChange����һ����������swim()����ô���ǰ�͸����װ��ģʽ��
   }
}
