class Main {
  public static boolean badP(int[] products,int limit)
  {
     int count=0;
     for(int i=0; i<products.length;i++){
       if(products[i]==0) count++;
     }
     return count<limit;
  }
}