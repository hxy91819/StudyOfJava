package io86;

import java.io.File;

/**
 * 实现资源管理器的形式，要求
 * 
 * 使用直接展示（带缩进的方式）
 * 
 * 注意：需要使用递归。
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
         
         flag++;//递归前应该前进一级目录
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
         flag--;//遍历完了一个目录，应该返回上一级
      }
      
   }
}
