import java.util.Arrays;
class Main {
  public static int[][] scalar(int[][] matrix ,int n) {
    int[][] multi = new int[matrix.length][matrix[0].length];
    for(int i=0; i<matrix.length;i++){
      for(int j=0; j<matrix[i].length;j++){
        multi[i][j]=matrix[i][j]*n;
      }
    }
    return multi;
  }
  
public static void main(String[] args)
{
  
  int [][] i= new int[][]
  {
   {1,1,1},
   {1,1,1}
  }; 
  i = scalar(i,2);
  System.out.println(Arrays.deepToString( i ));
  
}//end main
}