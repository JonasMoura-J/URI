package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double res = x*y/12;
		System.out.printf("%.3f\n", res);
		sc.close();
	}
}
