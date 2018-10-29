class Main {
  public static String extractNum(String s) {
    String numbers = "";
    for(int i = 0; i< s.length();i++){
      if(Character.isDigit(s.charAt(i))) numbers+=s.charAt(i);
    }
   return numbers;
  }
}