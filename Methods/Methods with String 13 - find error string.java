class Main {
  public static boolean isError(String line) 
  {
    if(line.substring(0,5).equals("error")){
      return true;
    }else return false;
  }
}