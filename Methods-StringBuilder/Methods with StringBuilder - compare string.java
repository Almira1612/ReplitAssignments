import java.util.*;
import java.lang.*;
class Main {
  public boolean isSame(String a,StringBuilder b) 
  {
    return a.equals(b.toString());
  
  }
  
  public static void main(String[] args)
  {
    Main m = new Main();
    
    
    boolean tst = m.isSame("test",new StringBuilder("test"));
    System.out.print(tst);

   
    
  }//end main
}