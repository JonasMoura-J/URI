package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int x = A+B;
		
		System.out.println("X = " + x);
		sc.close();
		
	}
}
