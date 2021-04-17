package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vect1 = new double[3];
		double[] vect2 = new double[3];
		
		for (int i = 0; i < 3; i++) {
			vect1[i] = sc.nextDouble();
		}
		for (int i = 0; i < 3; i++) {
			vect2[i] = sc.nextDouble();
		}
		
		double valor = vect1[1]*vect1[2] + vect2[1]*vect2[2];
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
		
		sc.close();
	}
}
