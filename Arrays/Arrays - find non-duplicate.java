
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO: write your code below
    for (int i = 0; i < nums.length; i++) {
			int single = nums[i];
			boolean duplicate = false;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i != j) {
					duplicate = true;
					break;
				}
			}
			if (duplicate == false) {
				System.out.println(single);
			}
		}
    
    
  }
}