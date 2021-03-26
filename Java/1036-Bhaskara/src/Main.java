import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vect = new double[3];
		for (int i = 0; i < 3; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double A = vect[0];
		double B = vect[1];
		double C = vect[2];
		
		if(A >= B+C) {
			System.out.println("NAO FORMA TRIANGULO");
		}if(Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)){
			System.out.println("TRIANGULO RETANGULO");
		}else if(Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}else if()
		
		sc.close();
	}

}
