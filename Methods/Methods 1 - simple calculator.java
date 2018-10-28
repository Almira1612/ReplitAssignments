import java.util.Scanner;

class Main {
  
 
  
  public static void main(String[] args) {
      
      plus();
  }
  
  public static void plus(){
     
    //your code here
    Scanner input = new Scanner(System.in);
   
    int num1 = input.nextInt();
  
    int num2 = input.nextInt();
    
    System.out.println("result: "+(num1+num2));
  }
  
}