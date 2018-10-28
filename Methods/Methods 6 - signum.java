import java.util.Scanner;
class Main {
  
  public static void sign(int n)
  {
    //your code here
    if(n > 0) System.out.print("1");
    else if(n == 0)System.out.print("0");
    else System.out.print("1");
  }//end sign
  
  public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
     int n = inp.nextInt();
    
    sign(n);
  }
}