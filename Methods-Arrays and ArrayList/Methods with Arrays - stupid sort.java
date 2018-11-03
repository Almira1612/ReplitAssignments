import java.util.Arrays;
class Main {
	public static int[][] stupidSort(int[] i) 
	{
	  int count = 0;
		while(!isSorted(i)) 
		{
			shuffle(i);
      count++;
		}
   int[][] sorted = new int[2][];
   sorted[0]=new int[1];
   sorted[0][0]=count;
   sorted[1]=new int[i.length];
   for(int j=0; j<i.length;j++){
     Arrays.sort(i);
     sorted[1][j]=i[j];
   }
   return sorted;
	}//end stupidSort
	
public static int[] shuffle(int[] i) 
{
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
		return i;
	}//end shuffle
	
	private static boolean isSorted(int[] i) 
	{
	   for(int n = 1; n < i.length; n++){
        if(i[n-1] > i[n]){
            return false;
        }
    }
    return true;
	  //
	}//end isSorted
	
}