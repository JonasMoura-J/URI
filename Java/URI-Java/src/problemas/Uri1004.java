package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int prod = a * b;
		
		System.out.printf("PROD = " + prod );
		
		sc.close();
		
	}
}
