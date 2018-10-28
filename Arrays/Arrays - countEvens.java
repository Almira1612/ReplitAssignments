
import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO: Write your code below
     int counter = 0;
		    for(int each : nums) {
		    	if(each%2 == 0)
		    		counter++;
		    }
		    System.out.println(counter);
  }
}