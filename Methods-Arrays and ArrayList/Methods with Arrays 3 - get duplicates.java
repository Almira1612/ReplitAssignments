class Main {
  
  public static int getDup(String[] r) 
  {
    int count = 0;
       for(int i = 0; i< r.length;i++) {
    	   for(int j=0;j<r.length;j++) {
    		   if(r[i].equals(r[j])&& j!=i){
    		     count++;
    		     break;
    		   } 
    	   }
       }
       return count;
   
  }
  
}