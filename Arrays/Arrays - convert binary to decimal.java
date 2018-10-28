import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int[] binary = new int[8];
    for(int i =0; i < binary.length; i++) {
      binary[i] = input.nextInt();
    }
    
    //TODO: Write your code below.
     int num = 0;
	    int[] value = new int[8];
	    value[binary.length-1] = 1;
	    for(int i = binary.length-2; i >= 0; i--) {
	    	value[i]=value[i+1]*2;
	    }
		
		for(int j =0; j < binary.length; j++) {
			if(binary[j]==1) {
				num+=value[j];
			}
		}
		System.out.println(num);
  }
}