import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
	  Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		//write your code below
		String largest = "";
		for(int i = 0; i < words.length; i++){
		  if(words[i].length()>largest.length()){
		    largest = words[i];
		  }
		}
		System.out.print(largest);
	}

}