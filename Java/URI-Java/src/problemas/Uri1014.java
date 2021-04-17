package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		double b = sc.nextDouble();
		
		double consumo = a/b;
		
		System.out.printf("%.3f km/l\n",consumo);
		
		sc.close();
	}
}
