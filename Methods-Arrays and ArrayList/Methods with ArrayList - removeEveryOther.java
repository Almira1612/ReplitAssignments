import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		
	}
	//create your method below
	public static void removeEveryOther(ArrayList<String> words){
	  for(int i=0; i<words.size();i++){
	    words.remove(words.get(i));
	  }
	  System.out.println(words);
	}
}