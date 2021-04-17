package problemas;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dinheiro = sc.nextDouble();
		
		double[] cedulas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25,0.10, 0.05, 0.01};
		
		int[] vect = new int[12];
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		for (int i = 0; i < 12; i++) {
				vect[i] = (int) (dinheiro/cedulas[i]);
				String s = df.format(dinheiro - vect[i]*cedulas[i]);
				dinheiro = Double.parseDouble(s);
		}

		System.out.println("NOTAS:\n"
				+ vect[0] + " nota(s) de R$ 100.00\n"
				+ vect[1] + " nota(s) de R$ 50.00\n"
				+ vect[2] + " nota(s) de R$ 20.00\n"
				+ vect[3] + " nota(s) de R$ 10.00\n"
				+ vect[4] + " nota(s) de R$ 5.00\n"
				+ vect[5] + " nota(s) de R$ 2.00\n"
				+ "MOEDAS:\n"
				+ vect[6] + " moeda(s) de R$ 1.00\n"
				+ vect[7] + " moeda(s) de R$ 0.50\n"
				+ vect[8] + " moeda(s) de R$ 0.25\n"
				+ vect[9] + " moeda(s) de R$ 0.10\n"
				+ vect[10] + " moeda(s) de R$ 0.05\n"
				+ vect[11] + " moeda(s) de R$ 0.01");
		sc.close();
	}
}
