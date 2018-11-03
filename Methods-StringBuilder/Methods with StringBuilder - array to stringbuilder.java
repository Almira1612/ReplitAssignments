import java.util.*;
import java.lang.*;
class Main {
  public static StringBuilder  arrayToSb(String[] r) 
  {
    StringBuilder newStr = new StringBuilder();
    for(int i=0; i<r.length;i++){
      newStr.append(r[i]);
    }
    return newStr;
   
  }
  
  public static void main(String[] args)
  {
    
    String[]  arr = new String[]{"a","1","2"};
    

    StringBuilder recipt = arrayToSb(arr);
    System.out.print(recipt.toString());

   
    
  }//end main
}