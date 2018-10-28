import java.util.Scanner;
class Main {
  
 
  
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    String s = inp.next();
    person(s) ;
  }
  
   public static void person(String info) 
	{
	
		//your code here
		String[] splitted  = info.split(",");
		String name = splitted[0];
		String lastName = splitted[1];
		String age = splitted[2];
		System.out.print("person name: "+name+" last name: "+lastName+" age: "+age);
	
	}//end person
  
}