
class Main {
  public static  double convertC(String[][] money,String[][] convertionRate) 
  {
    double sum= 0.0;
    String dollars = "";
  
  for(int i =0;i<money.length;i++){
    for(int j=0; j< convertionRate.length;j++){
      if(money[i][0].equals(convertionRate[j][0])){
         sum+=Double.parseDouble(money[i][1])*Double.parseDouble(convertionRate[j][1]);
      }
    }
  }
  return sum;
  
  }
  
    public static void main(String[] args) 
   {
     
     
     
     String[][] test_money =
     {
       {"mark","5"},
       {"shekel","30.5"},
     };
     
     String[][] test_convert=
     {
       {"mark","1"},
       {"shekel","0.5"},
     };
     
     double res = Main.convertC(test_money,test_convert);
     System.out.print(res);
     
   }

  
}