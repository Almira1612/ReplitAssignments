class Main {
  public String c_profits (int buyPrice,int sellPrice)
  {
    //your code here
   if(buyPrice < sellPrice) return "profit";
   else if(buyPrice==sellPrice) return "no loss";
   else return "loss";
   
   
  }
}