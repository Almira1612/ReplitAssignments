import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		
	}
	//create your method below
	public static void repeatAL(ArrayList<Boolean> bool){
	 ArrayList<Boolean> newArr = new ArrayList<>(bool);
		  bool.addAll(newArr);
		  System.out.println(bool);
	}
}