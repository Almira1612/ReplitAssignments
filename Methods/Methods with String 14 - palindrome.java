class Main {
  public static boolean isPalindrome(String check) {
    String check2 = check.replace(" ","").toLowerCase();
    String reversed = "";
    for(int i = check2.length()-1; i >= 0;i--){
      reversed+= check2.charAt(i);
    }
    if (reversed.equals(check2)) return true;
    else return false;
  }
}