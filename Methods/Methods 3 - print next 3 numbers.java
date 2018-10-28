import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
     System.out.print("enter number");
     int num = inp.nextInt();
     next3(num);
  
  }
 public static void next3(int num){
   System.out.print((num+1)+" "+(num+2)+" "+(num+3));
 } 
  
 
 
}