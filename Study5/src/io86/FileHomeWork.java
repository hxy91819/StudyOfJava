package io86;

import java.io.File;

/**
 * ʵ����Դ����������ʽ��Ҫ��
 * 
 * ʹ��ֱ��չʾ���������ķ�ʽ��
 * 
 * ע�⣺��Ҫʹ�õݹ顣
 * 
 * @author hxy
 *
 */
public class FileHomeWork {
   private static int flag = 0;
   
   public static void main(String[] args) {
      File file = new File("E:\\IdeaHealthProject\\Health\\hcCode\\app\\his");
      FileHomeWork.showAll(file);
      
   }
   
   public static void showAll(File file){
      String indentString = "";
      
      for(int i = 0; i < flag; i++){
         indentString += "   |";
      }
      
      if(file.isFile() || file.list().length == 0){
         System.out.println(indentString + file.getName());
      }
      else {
         File[] files = file.listFiles();
         
         flag++;//�ݹ�ǰӦ��ǰ��һ��Ŀ¼
         for(File f : files){
            if(f.isDirectory()){
               System.out.println(indentString + f.getName());
               showAll(f);
            }
         }
         
         for(File f : files){
            if(f.isFile()){
               System.out.println(indentString + f.getName());
            }
         }
         flag--;//��������һ��Ŀ¼��Ӧ�÷�����һ��
      }
      
   }
}
