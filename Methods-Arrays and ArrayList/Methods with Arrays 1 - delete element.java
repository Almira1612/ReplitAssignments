import java.util.*;

class Main {
  public static int[] deleteR(int[] arr,int element) {
    int[] newArr = new int[arr.length-1];
	    
	    for(int i=0; i<arr.length;i++) {
	    
	    	if(arr[i]==element) {
	    		for(int j=i;j<arr.length-1;j++) {
	    			newArr[j]=arr[j+1];
	    		}
	    		break;
	    	}else 	newArr[i]=arr[i];
	    	
	    }

   return newArr;
  }//end deleteR
  

}