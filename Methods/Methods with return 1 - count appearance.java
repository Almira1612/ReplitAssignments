class Main {
  
  public int  count_appearance(String[] arr,String t)
  {
   int count = 0;
   for(int i = 0; i< arr.length; i++){
     if(arr[i].equalsIgnoreCase(t))
     count++;
   }
   return count;
  } //end  count_appearance
  

}