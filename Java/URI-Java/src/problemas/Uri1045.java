package problemas;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vect = new double[3];
		for (int i = 0; i < 3; i++) {
			vect[i] = sc.nextDouble();
		}
		
		Arrays.sort(vect);
		
		double A = vect[2];
		double B = vect[1];
		double C = vect[0];
		
		if(A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if(Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)){
				System.out.println("TRIANGULO RETANGULO");
			}
			if(Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if(Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if((A == B && A != C) || (B == C && B != A) || (A == C && A != B)){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		sc.close();
	}

}
