import java.util.*;

class Main {
  public String blogDb(ArrayList<String[]> r,String id)  {
   String result = null;
	    for(String[] eachArr : r){
	      if(eachArr[0].equals(id)){
	      result =  eachArr[1]+"\n"+eachArr[2];
	      }
	    }
	    return result;
   
  }
  
  public static void main(String[] args) {
    Main m = new Main();
    ArrayList<String[]>  arr = new ArrayList<String[]>();
    arr.add(new String[]{"1","title 1","content"});
    arr.add(new String[]{"2","title 2","content"});
    arr.add(new String[]{"3","title 3","content3"});

    String post = m.blogDb(arr,"3");
    System.out.print(post);
    //should output:
    //title 3 
    //content3
   
    
  }//end main
}