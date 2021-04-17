package problemas;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Uri1064 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Double> numerosPositivos = new ArrayList<>();
		double media = 0;
		
		for (int i = 0; i < 6; i++) {
			double a = sc.nextDouble();
			if(a>0) {
				numerosPositivos.add(a);
				media += a;
			}
		}
		
		System.out.println(numerosPositivos.size() + " valores positivos");
		System.out.printf("%.1f\n", media/numerosPositivos.size());
		sc.close();
	}
}
