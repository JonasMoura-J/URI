package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1044 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vect = new double[3];
		for (int i = 0; i < 3; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double delta = Math.pow(vect[1],2)-4*vect[0]*vect[2];
		
		
		if(vect[0] == 0 || delta<0) {
			System.out.println("Impossivel calcular");
		}else {
			double R1 = (-vect[1] + Math.sqrt(delta))/(2*vect[0]);
			double R2 = (-vect[1] - Math.sqrt(delta))/(2*vect[0]);
			
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}
		sc.close();
	}

}
