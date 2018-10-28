import java.util.Scanner;
class Main {
  
  public static void cube()
  {
    //your code here
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println(num*num*num);
  }//end cube
  
  public static void main(String[] args) {
    
    cube();
   
  }
}