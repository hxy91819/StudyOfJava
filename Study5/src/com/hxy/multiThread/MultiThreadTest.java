package com.hxy.multiThread;

/**
 * synchronized���෽��ִ�е�Ӱ��
 * 
 * ���һ���߳���ִ��synchronized���εķ���ʱ�����߳�δ����ǰ���ǲ�����ø�����ͬ���ͷ����ġ�
 * 
 * ���ڡ�ͬ���ͷ������Ķ��壺static�ͷ�static���εġ�
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
      method("�Ǿ�̬��method1����");
   }

   public synchronized void method2()
   {
      method("�Ǿ�̬��method2����");
   }

   public static synchronized void method3()
   {
      method("��̬��method3����");
   }

   public static synchronized void method4()
   {
      method("��̬��method4����");
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