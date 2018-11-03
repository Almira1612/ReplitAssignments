import java.util.ArrayList;

class Main
{

	//create your method below
	public static void removeAll(ArrayList<String> wordList, String targetWord){
	  for(int i=0;i< wordList.size();i++) {
			if(wordList.get(i).equals(targetWord)) {
				wordList.remove(i);
				i--;
			}
		}
		System.out.println(wordList);
	}
}