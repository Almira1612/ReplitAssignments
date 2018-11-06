import java.util.*;
import java.lang.*;
class Main {
  public StringBuilder trim_posts(String[] r,int size) 
  {
    StringBuilder result = new StringBuilder();
    for(String each : r){
      if(each.length()<size){
        result.append(each).append("<br>");
      }
    }
   return result;
   
  }
  
  public static void main(String[] args)
  {
    Main m = new Main();
    
    String[]  arr = new String[]{"abcde","12345678","a very long post"};
    
    StringBuilder tst = m.trim_posts(arr,9);
    System.out.print(tst);

   
    
  }//end main
}