package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < n; i++) {
			
			vect[i] = vect[i] + vect[i--];
			System.out.println(vect);
		}
		sc.close();
	}
}
