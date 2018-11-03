import java.util.Arrays;
class Main {
public static int[] do_switch(int[] i) 
 {
   int temp = i[0];
   i[0]=i[i.length-1];
   i[i.length-1]=temp;
   return i;
	}
}