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
		double a = vect[0];
		double b = vect[1];
		double c = vect[2];
		
		if((b+c>a)&&(a+c>b)&&(b+a>c)) {
			double perime = vect[0]+vect[1]+vect[2];
			System.out.printf("Perimetro = %.1f\n", perime);
		}else {
			double area = (a+b)*c/2;
			System.out.printf("Area = %.1f\n", area);
		}
		sc.close();
	}
}
