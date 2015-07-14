package com.hxy.multiThread;

import java.io.IOException;


/**
 * ���̳߳�������
 * @author hxy
 *
 */
@SuppressWarnings("unused")
public class MultiThread
{
   @SuppressWarnings("deprecation")
   public static void main(String args[])
   {
      System.out.println("THREAD:�������߳�!");
      // ���洴���߳�ʵ��thread1
      ThreadUseExtends thread1 = new ThreadUseExtends();
      // ����thread2ʱ��ʵ����Runnable�ӿڵ�ThreadUseRunnable��ʵ��Ϊ����
      Thread thread2 = new Thread(new ThreadUseRunnable(), "SecondThread");
      thread1.start();// �����߳�thread1ʹ֮���ھ���״̬
      // thread1.setPriority(6);//����thread1�����ȼ�Ϊ6
      // ���ȼ�������cpu�ճ�ʱ�����ھ���״̬���߳�˭��ռ��cpu��ʼ����
      // ���ȼ���Χ1��10,MIN_PRIORITY,MAX_PRIORITY,NORM_PAIORITY
      // ���̼̳߳д������ĸ��߳����ȼ�,���߳�ͨ������ͨ���ȼ���5NORM_PRIORITY
      System.out.println("THREAD:���߳̽�����7��!");
      try
      {
         Thread.sleep(7000);// ���̹߳���7��
      } catch (InterruptedException e)
      {
         return;
      }
      System.out.println("THREAD:�ֻص������߳�!");
      if (thread1.isAlive())
      {
         thread1.stop();// ���thread1��������ɱ����
         System.out.println("THREAD:thread1���߹���,���߳�ɱ����thread1!");
      }
      else
         System.out.println("THREAD:���߳�û����thread1,thread1����˳��ִ�н�����!");
      
      System.out.println("-------------------------------");
      thread2.start();// ����thread2
      System.out.println("THREAD:���߳��ֽ�����7��!");
      try
      {
         Thread.sleep(7000);// ���̹߳���7��
      } catch (InterruptedException e)
      {
         return;
      }
      System.out.println("THREAD:�ֻص������߳�!");
      if (thread2.isAlive())
      {
         thread2.stop();// ���thread2��������ɱ����
         System.out.println("THREAD:thread2���߹��������߳�ɱ����thread2!");
      }
      else
         System.out.println("THREAD:���߳�û����thread2,thread2����˳��ִ�н�����!");
      
//      System.out.println("������������������!");
//      try
//      {
//              System.in.read();
//      }
//      catch (IOException e)
//      {
//              System.out.println(e.toString());
//      }
   }// main
}// MultiThread

/**
 * ͨ���̳�Thread��,��ʵ�����ĳ��󷽷�run() �ʵ�ʱ�򴴽���һThread�����ʵ����ʵ�ֶ��̻߳���
 * һ���߳�������Ҳ���������״̬��һ�����CPU���Զ���������run()����
 * 
 * @author hxy
 *
 */
class ThreadUseExtends extends Thread
{

   ThreadUseExtends() {
   }// ���캯��

   public void run()
   {
      System.out.println("SUB_THREAD1:����Thread������߳�ʵ��!");
      System.out.println("SUB_THREAD1:�ҽ�����10��!");
      System.out.println("SUB_THREAD1:�ص����߳�,���Ե�,�ղ����̹߳�����ܻ�û�ѹ�����");
      try
      {
         sleep(10000);// ����
      } catch (InterruptedException e)
      {
         return;
      }
      // �����run()����˳��ִ������,�߳̽��Զ�����,�����ᱻ���߳�ɱ��
      // ���������ʱ�����,���̻߳����,���ܱ�stop()ɱ��
   }
}

/**
 * ͨ��ʵ��Runnable�ӿ��е�run()����,�������ʵ����run()�������ࡣΪ��������Thread���߳�ʵ��
 * 
 * @author hxy
 *
 */
class ThreadUseRunnable implements Runnable
{
   // Thread thread2=new Thread(this);
   // �����ʵ����Runnable�ӿ���run()��������Ϊ��������Thread����߳�ʵ��
   ThreadUseRunnable() {
   }// ���캯��

   public void run()
   {
      System.out.println("SUB_THREAD2:����Thread����߳�ʵ������ʵ����Runnable�ӿڵ���Ϊ����!");
      System.out.println("SUB_THREAD2:�ҽ�����1��!");
      System.out.println("SUB_THREAD2:�ص����߳�,���Ե�,�ղ����̹߳�����ܻ�û�ѹ�����");
      try
      {
         Thread.sleep(1000);// ����
      } catch (InterruptedException e)
      {
         return;
      }
      // �����run()����˳��ִ������,�߳̽��Զ�����,�����ᱻ���߳�ɱ��
      // ���������ʱ�����,���̻߳����,���ܱ�stop()ɱ��
   }
}