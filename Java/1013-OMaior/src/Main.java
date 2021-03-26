import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[] vect = new int[3];
				
		for (int i = 0; i < 3; i++) {
			vect[i] = sc.nextInt();
		}
		
		Arrays.sort(vect);
		
		System.out.println(vect[2] + " eh o maior");
		
		sc.close();
	}
}
