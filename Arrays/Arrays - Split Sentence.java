import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    //type your code below
     String[] words  = sentence.split(" ");
		 for(String each : words) {
			 System.out.println(each);
		 }
  }
}