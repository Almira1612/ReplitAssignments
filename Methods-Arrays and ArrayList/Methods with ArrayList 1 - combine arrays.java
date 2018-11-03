import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Main {
  public static String combineRs(String[] r1,String[] r2) 
  {
    String front = "";
    for(int i = 0; i< r1.length;i++){
      front+= r1[i];
    }
    String last = "";
    for(int j = 0; j< r2.length;j++){
      last+= r2[j];
    }
   return front+last;
  }
}