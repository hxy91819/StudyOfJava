package com.hxy.multiThread;

/**
 * ����ģʽ�̰߳�ȫ����ʾ
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
 * �̲߳���ȫ��Singletonģʽ
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
         Thread.yield(); // Ϊ�˷Ŵ�Singletonģʽ���̲߳���ȫ��
         sample = new Singleton();
      }
      return sample;
   }
}

/**
 * �̰߳�ȫ�ĵ���ģʽ1
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
         Thread.yield(); // Ϊ�˷Ŵ�Singletonģʽ���̲߳���ȫ��
         sample = new SingletonSync();
      }
      return sample;
   }
}

/**
 * �̰߳�ȫ�ĵ���ģʽ2
 * @author hxy
 *
 */
class SingletonSync2{
   private static final SingletonSync2 sample = new SingletonSync2();//����Ϊfinal������ֵ��

   private SingletonSync2()
   {
   }

   public static SingletonSync2 getInstance()
   {
      return sample;
   }
}