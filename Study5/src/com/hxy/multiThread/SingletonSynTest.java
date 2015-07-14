package com.hxy.multiThread;

/**
 * 单例模式线程安全性演示
 * @author hxy
 *
 */
public class SingletonSynTest extends Thread {
   public void run()
   {
//      Singleton singleton = Singleton.getInstance();
//      SingletonSync singleton = SingletonSync.getInstance();
      SingletonSync2 singleton = SingletonSync2.getInstance();
      System.out.println(singleton.hashCode());
   }

   public static void main(String[] args)
   {
      Thread threads[] = new Thread[5];
      for (int i = 0; i < threads.length; i++)
         threads[i] = new SingletonSynTest();
      for (int i = 0; i < threads.length; i++)
         threads[i].start();
   }
}

/**
 * 线程不安全的Singleton模式
 * 
 * @author hxy
 *
 */
class Singleton
{
   private static Singleton sample;

   private Singleton()
   {
   }

   public static Singleton getInstance()
   {
      if (sample == null)
      {
         Thread.yield(); // 为了放大Singleton模式的线程不安全性
         sample = new Singleton();
      }
      return sample;
   }
}

/**
 * 线程安全的单例模式1
 * @author hxy
 *
 */
class SingletonSync{
   private static SingletonSync sample;

   private SingletonSync()
   {
   }

   public static synchronized SingletonSync getInstance()
   {
      if (sample == null)
      {
         Thread.yield(); // 为了放大Singleton模式的线程不安全性
         sample = new SingletonSync();
      }
      return sample;
   }
}

/**
 * 线程安全的单例模式2
 * @author hxy
 *
 */
class SingletonSync2{
   private static final SingletonSync2 sample = new SingletonSync2();//定义为final，并赋值。

   private SingletonSync2()
   {
   }

   public static SingletonSync2 getInstance()
   {
      return sample;
   }
}