import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("-----EXAMPLE RUN ---------");
    String[] numbers = {"zero", "one", "two","three","four"};
    System.out.println(Arrays.toString(getWithE(numbers)));
    
  }
  
  
  
  public static String[] getWithE(String[] arr) {
    
    //TODO : YOUR CODE GOES HERE ----------------------
    
    int counter = 0;
   for(String str : arr){
     if(str.contains("e")){
       counter++;
     }
   }
    String[] fewValues = new String[counter];
     
     int i =0;
     for(String each : arr){
       if(each.contains("e")){
         fewValues[i] = each;
         i++;
       }
     }
   
    
    
    
    
    //YOUR CODE ENDS HERE -----------------------
    
    return fewValues;
  }
  
  
  
}