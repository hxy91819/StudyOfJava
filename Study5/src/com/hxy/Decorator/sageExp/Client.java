package com.hxy.Decorator.sageExp;

public class Client {
   public static void main(String[] args) {
      TheGreatestSage sage = new Monkey();
      
      FishChange fish = new FishChange(sage);//（把）猴子变成了鱼，此时既具备猴子的功能，又具备鱼的功能。
      
      fish.say();//透明的装饰模式
      
      //如果给FishChange增加一个方法，如swim()，那么就是半透明的装饰模式。
   }
}
