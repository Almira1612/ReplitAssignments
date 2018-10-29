class Main {
  public static boolean isAnagram(String word1, String word2) {
    	boolean isAnagram = false;
		word1 = word1.toLowerCase().replace(" ", "");
		word2 = word2.toLowerCase().replace(" ", "");
       if(word1.length()==word2.length()) {
    	   for (int i = 0; i < word1.length(); i++) {
			int count = 0;
			for (int j = 0; j < word2.length(); j++) {				
					if (word1.charAt(i) == (word2.charAt(j))) {
                       count++;
                                             
					}
					if(count>1) isAnagram = false;
					else isAnagram = true;									
			}
		}
    	   
       }else isAnagram = false;
		
		return isAnagram;

  }
}