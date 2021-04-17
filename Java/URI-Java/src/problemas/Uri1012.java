package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] vect = new double[3];
		
		for (int i = 0; i < 3; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double a = vect[0];
		double b = vect[1];
		double c = vect[2];
		
		double triangulo = a*c /2;
		double circulo = 3.14159* Math.pow(c,2);
		double trap = (a+b)*c/2;
		double quadrado = Math.pow(b, 2);
		double retang = a*b;
		System.out.printf("TRIANGULO: %.3f\n"
				+ "CIRCULO: %.3f\n"
				+ "TRAPEZIO: %.3f\n"
				+ "QUADRADO: %.3f\n"
				+ "RETANGULO: %.3f\n" , triangulo, circulo, trap, quadrado, retang);
		
		sc.close();
	}
}
