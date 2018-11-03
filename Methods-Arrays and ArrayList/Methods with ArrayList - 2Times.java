import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		
	}
	//create your method below
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
	  ArrayList<Integer> newArr = new ArrayList<>();
	  for(int i=0; i<nums.size(); i++){
	    newArr.add(nums.get(i));
	    newArr.add(nums.get(i));
	  }
	  return newArr;
	}
}