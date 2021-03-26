import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[2];
		for (int i = 0; i < 2; i++) {
			vect[i] = sc.nextInt();
		}
		
		double valorLanche;
		
		if(vect[0] == 1) {
			valorLanche = 4.00;
		}else if (vect[0] == 2) {
			valorLanche = 4.50;
		}else if (vect[0] == 3) {
			valorLanche = 5.00;
		}else if (vect[0] == 4) {
			valorLanche = 2.00;
		}else {
			valorLanche = 1.50;
		}
	
		System.out.printf("Total: R$ %.2f\n", valorLanche*vect[1]);
		
		sc.close();
	}
}
