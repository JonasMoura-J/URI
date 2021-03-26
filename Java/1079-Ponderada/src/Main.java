import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.#");
		
		int qnt = sc.nextInt();
		
		double[][] matriz = new double[qnt][3];
		
		for (int i = 0; i < qnt; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextDouble();
			}
			
		
		}
		for (int i = 0; i < qnt; i++) {
			double media = (matriz[i][0]*2+ matriz[i][1]*3 +matriz[i][2]*5)/10;
			System.out.printf("%.1f\n", media);
		}

		sc.close();
	}
}
