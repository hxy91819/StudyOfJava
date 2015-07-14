package io86;

import java.io.File;

/**
 * ɾ���ǿ��ļ���
 * 
 * ʹ�õݹ�ķ���
 * @author hxy
 *
 */
public class FileTest7 {
   public static void main(String[] args) {
      File file = new File("E:\\test");
      FileTest7.deleteAll(file);
      System.out.println("finished!");
   }
   
   /**
    * �ݹ鷽��ɾ�������ļ���
    * @param file
    */
   public static void deleteAll(File file){
      //���ڣ��������Ϊһ���ļ�����ֱ��ɾ�������Ŀ¼Ϊ�գ���ֱ��ɾ����
      if(file.isFile() || file.list().length == 0){
         file.delete();
      }
      else{
         //��������file��һ���ǿյ�Ŀ¼
         File[] files = file.listFiles();
         for(File f:files){
            //��������ļ��У�Ȼ������ɾ�����Ŀ¼��Ķ�����
            deleteAll(f);
            
            //ע������Ķ���ɾ������֮����Ҫɾ���Լ�
            f.delete();
         }
         //ɾ������������ļ���֮����ɾ���Լ���
         file.delete();
      }
   }
}
