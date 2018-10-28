
import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
   

    //TODO: Write your code below
     for(String each : words) {
	    	System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));
	    }
	    
    
  }
}