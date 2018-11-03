import java.util.*;

class Main {
  public static boolean isSort(int[] nums)  {
    boolean sorted = false;
    for(int i =0; i< nums.length-1;i++){
      if(nums[i+1]>nums[i]) 
          sorted = true;
        else sorted = false;
  }return sorted;
 }
}