package io86;

import java.io.File;

/**
 * 删除非空文件夹
 * 
 * 使用递归的方法
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
    * 递归方法删除所有文件夹
    * @param file
    */
   public static void deleteAll(File file){
      //出口：如果参数为一个文件，则直接删除；如果目录为空，则直接删除。
      if(file.isFile() || file.list().length == 0){
         file.delete();
      }
      else{
         //表明现在file是一个非空的目录
         File[] files = file.listFiles();
         for(File f:files){
            //进入这个文件夹，然后依次删除这个目录里的东西。
            deleteAll(f);
            
            //注意里面的东西删除完了之后，需要删除自己
            f.delete();
         }
         //删除完了里面的文件夹之后，再删除自己。
         file.delete();
      }
   }
}
