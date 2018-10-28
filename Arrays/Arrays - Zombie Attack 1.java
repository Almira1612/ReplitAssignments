import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] inhabitants = new int[8];
    for(int i=0; i<inhabitants.length; i++) {
      inhabitants[i] = input.nextInt();
    }
    
    //TODO. Write you code below this line. 
    System.out.println("Day 0" + " " +Arrays.toString(inhabitants));
		for (int i = 1; i < inhabitants.length; i++) {
			int sum = 0;
			for (int j = 0; j < inhabitants.length; j++) {
				if (inhabitants[j] > 1) {
					
					inhabitants[j] = inhabitants[j] / 2;
				} else {
					inhabitants[j] = 0;
				}
			}

			for (int city : inhabitants) {
				sum += city;
			}
			System.out.println("Day " + i + " "+Arrays.toString(inhabitants));
			if (sum == 0) {
				System.out.println("---- EXTINCT ----");
				break;
			}
		}
    
  }
}