import java.util.*;
import java.lang.*;
class Main {
  public boolean toBe(StringBuilder r) 
  {
    String str = r.toString();
		String[] splitR = str.split(",");
		if(splitR[0].equals("false")&&splitR[1].equals("false"))
			return false;
		else return true;
    
   
  }
  
  public static void main(String[] args)
  {
    Main m = new Main();
    
    StringBuilder  bool = new StringBuilder("true,false");
    
    boolean tst = m.toBe(bool);
    System.out.print(tst);

   
    
  }//end main
}