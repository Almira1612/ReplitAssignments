
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO Type your code below:
    
     boolean nextTo = false;
		    for(int i = 0; i < nums.length-1; i++) {
		    	if(nums[i] == 5 && nums[i+1]==5) {
		    		nextTo = true;
		    	}
		    }
		    System.out.println(nextTo);
    
  }
}