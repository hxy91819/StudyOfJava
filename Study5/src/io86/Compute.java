package io86;

public class Compute {
   public static void main(String[] args) {
      Compute compute = new Compute();
      
      System.out.println(compute.computeInt(3));
   }
   
   public int computeInt(int number){
      if(number == 1){
         return 1;
      }
      return number * computeInt(number - 1);
   }
}
