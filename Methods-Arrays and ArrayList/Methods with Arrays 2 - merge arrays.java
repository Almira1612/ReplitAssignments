import java.util.Arrays;
class Main {
  public static int[] mergR(int[] a,int[] b) {
     int length = a.length+b.length;
		    int[] newArr = new int[length];
		    for(int i =0; i < a.length;i++){
		      newArr[i]=a[i];
		    }
		   for(int j =a.length ;j<length;j++ ){
		     newArr[j]=b[j-a.length];
		   }
		    return newArr;
  }//end mergR
  
  public static void main(String[] args) 
  {
   
  }
}