package EX01;

public class text {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; i++) {
				total ++;
			}
		}
      System.out.println(total);
	}

}
