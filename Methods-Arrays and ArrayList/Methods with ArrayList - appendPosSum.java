import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		
	}
	//create your method below
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
	  ArrayList <Integer> newNums = new ArrayList<Integer>(nums);
	  int sum=0;
	  for(int i=0;i<newNums.size();i++){
	    if(newNums.get(i)<=0){
	      newNums.remove(newNums.get(i));
	      i--;
	    }
	    else sum+=newNums.get(i);
	  }
	  newNums.add(sum);
	  return newNums;
	}
}