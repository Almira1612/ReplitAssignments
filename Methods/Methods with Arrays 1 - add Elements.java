import java.util.*;

class Main {
  
  public static int[] addElements(int[] ints1, int[] ints2) {
    int[] newInt = new int[5];
    for (int i=0; i< ints1.length;i++){
    newInt[i] = ints1[i]+ints2[i];
    
  }
  return newInt;
  
}
}