import java.util.ArrayList;
import java.util.Arrays;
class Main
{

	//create your method below
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
		  ArrayList<String> combineAll = new ArrayList<>();
		  for(int i=0; i<wordList1.size();i++){
		    combineAll.add(wordList1.get(i));
		  }
		   for(int j=0; j<wordList2.size();j++){
		    combineAll.add(j+wordList1.size(),wordList2.get(j));
		  }
		  return combineAll;
		}
}