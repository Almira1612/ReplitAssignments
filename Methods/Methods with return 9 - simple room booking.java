class Main {
  public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
  {
    if(isAvailable==true && year == 2018) {
		    	if(month == 7 && day >=1 && day <=8) {
		    		return false;
		    	}else return true;
		    }else return false;
   
  }
}