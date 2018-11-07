import java.util.*;

class Main {
  public String printList(ArrayList<ArrayList<String>> nestedList) 
  {
    StringBuilder newStr = new StringBuilder();
    for(int i =0; i<nestedList.size(); i++){
      for(int j=0; j<nestedList.get(i).size();j++){
        newStr.append(nestedList.get(i).get(j));
      }
    }
   return newStr.toString();
  }
  public static void main(String[] args)
  {
    Main m = new Main();
    ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
    arr.add(new ArrayList<String>());
    arr.add(new ArrayList<String>());
    String[] strs = new String[]{"a","a","b"};
    Collections.addAll(arr.get(0),strs);
    
    strs = new String[]{"z","z","z"};
    Collections.addAll(arr.get(1),strs);
    
    
    System.out.print(m.printList(arr));
   
    
  }//end main
}