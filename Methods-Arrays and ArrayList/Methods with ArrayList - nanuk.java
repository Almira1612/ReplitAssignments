import java.util.*;

class Main {
  public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) 
  {
    boolean result = false;
		int countOfNanuks = 0;
		int countOfHunts = 0;
		for(int i =0; i<r.size();i++) {
			if(r.get(i).equals("nanuk")) {
				countOfNanuks++;
			}else countOfHunts+=Integer.valueOf(r.get(i));
		}
		if(way_stones>=countOfNanuks && countOfHunts>=boast) {
			result =true;
		}
		return result;	
  }
  
  public static void main(String[] args)
  {
   
    ArrayList<String>  arr = new ArrayList<String>();
    arr.add("2");
    arr.add("6");
    arr.add("nanuk");
    arr.add("nanuk");
    
  
    boolean hunt = nanuk(arr,2,10);
    if(hunt)
    {
      System.out.print("successful hunt");
    }
    else
    {
      System.out.print("this hunt is doomed");
    }
    
  
   
    
  }//end main
}