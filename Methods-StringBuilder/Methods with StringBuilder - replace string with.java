import java.util.*;
import java.lang.*;
class Main {
  public StringBuilder replaceWith(String[] r,String replace,String replaceWith) 
  {
    StringBuilder newR = new StringBuilder();
    for(String each : r){
      
      if(each.equals(replace)){
        newR.append(replaceWith);
      }else newR.append(each);
    }
   return newR;
  }
  
  public static void main(String[] args)
  {
    Main m = new Main();
    
    String[] r= new String[]{"a","b","a","b"};
    
    StringBuilder tst = m.replaceWith(r,"b","a");
    System.out.print(tst);

   
    
  }//end main
}