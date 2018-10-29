
import java.util.*;

class Main {
  public static void main(String[] args) {
    //test your code
    System.out.println( uniqueChars("wooden-spoon") ) ;
  }
  
  public static String uniqueChars(String str) {
    //TODO: write your below
   for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				
				if (str.charAt(i) == str.charAt(j) && i!=j) {
					
					str = str.substring(0,j)+str.substring(j+1);
					break;
				} 
					
			}	
			
		}
		return str;
  }
}