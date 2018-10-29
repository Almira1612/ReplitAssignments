class Main {
  public static String clean (String text ,String badWord) {
     String newText = text.replaceAll(badWord,"");
     return newText;
      
  }
}