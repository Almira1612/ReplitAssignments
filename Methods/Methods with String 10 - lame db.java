class Main {
  public static String lameDb(String db, String op,String id,String data)
  {
    	    String newStr = "";

	    if(op.equals("add")) {
	    	newStr = db+"#"+id+data;
	    }
	    else if(op.equals("edit")) {
	    	for(int i = 0; i< db.length();i++) {

	    		if(db.substring(i,i+1).equals(id)) {
	    			newStr = db.substring(0,i+1)+data+db.substring(i+1+data.length());
	    		}
	    	}
	    }
	    else if(op.equals("delete")) {
	  String[] splitted = db.split("#");
	    
	     for(int i = 0; i< splitted.length;i++) {
	    	
	    	 if(splitted[i].substring(0,1).equals(id)) {
	    //My note:  If splitted string begin with same number as id, do nothing, else, add to new string	
	    	
	    	 } else newStr += "#"+splitted[i] ;   	
	     }
	     if(newStr.substring(1, 2).equals("1")) {
	    	 newStr = newStr.substring(1);
	     }
	    

	    }else newStr = db;
	    
	    return newStr;
    
  }//end lameDb
  
  
   public static void main(String[] args) 
   {
    
     
     System.out.print(
       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
       );
       
      System.out.print(
       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
       );
       
      System.out.print(
       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
       );
       
        System.out.print(
       lameDb("1tst#2bla#3foo","none","1","")+"\n"
       );
     
   }
  
}