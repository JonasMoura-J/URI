import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contPar = 0;
		
		for (int i = 0; i < 5; i++) {
			double a = sc.nextDouble();
			if(a%2 == 0) {
				contPar++;
			}
		}
		
		System.out.println(contPar + " valores pares");
		sc.close();
	}
}
