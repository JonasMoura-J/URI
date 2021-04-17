package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vectx = new double[2];
		for (int i = 0; i < 2; i++) {
			vectx[i] = sc.nextDouble();
		}
		
		double[] vecty = new double[2];
		for (int i = 0; i < 2; i++) {
			vecty[i] = sc.nextDouble();
		}

		double distancia = Math.sqrt(Math.pow((vecty[0]-vectx[0]), 2) + Math.pow((vecty[1]-vectx[1]), 2));

		System.out.printf("%.4f\n", distancia);
		sc.close();
	}
}
