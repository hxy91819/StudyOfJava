package com.hxy.multiThread;

/**
 * synchronized对类方法执行的影响
 * 
 * 如果一个线程在执行synchronized修饰的方法时，此线程未结束前，是不会调用该类中同类型方法的。
 * 
 * 关于“同类型方法”的定义：static和非static修饰的。
 * 
 * @author hxy
 *
 */
public class MultiThreadTest extends Thread
{
   public String methodName;

   public static void method(String s)
   {
      System.out.println(s);
      while (true)
         ;
   }

   public synchronized void method1()
   {
      method("非静态的method1方法");
   }

   public synchronized void method2()
   {
      method("非静态的method2方法");
   }

   public static synchronized void method3()
   {
      method("静态的method3方法");
   }

   public static synchronized void method4()
   {
      method("静态的method4方法");
   }

   public void run()
   {
      try
      {
         getClass().getMethod(methodName).invoke(this);
      } catch (Exception e)
      {
      }
   }

   public static void main(String[] args) throws Exception
   {
      MultiThreadTest myThread1 = new MultiThreadTest();
      for (int i = 1; i <= 4; i++)
      {
         myThread1.methodName = "method" + String.valueOf(i);
         new Thread(myThread1).start();
         sleep(100);
      }
   }
}