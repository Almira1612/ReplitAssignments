import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int decimal = input.nextInt();
    int[] binary = new int[8];
    
    //TODO: Write your code below.
    int[] value = new int[8];
     value[binary.length-1] = 1;
	    for(int i = binary.length-2; i >= 0; i--) {
	    	value[i]=value[i+1]*2;
	    }
	    for(int i = 0; i< binary.length;i++) {
	    	if(decimal >= value[i]) {
	    		binary[i] = 1;
	    		decimal-=value[i];
	    	}else {
	    		binary[i] = 0;
	    	}
	    	
	    }
	    System.out.println(Arrays.toString(binary));
    
  }
}