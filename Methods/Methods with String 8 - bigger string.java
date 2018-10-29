class Main {
  public static String biggerS(String a ,String b)
  {
   String longer = a;
   if(a.length()<b.length())
   longer = b;
   return longer;
  }
}