package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contPositivo = 0;
		
		for (int i = 0; i < 6; i++) {
			double a = sc.nextDouble();
			if(a>0) {
				contPositivo++;
			}
		}
		
		System.out.println(contPositivo + " valores positivos");
		sc.close();
	}
}
