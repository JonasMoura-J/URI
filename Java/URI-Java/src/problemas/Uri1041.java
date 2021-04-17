package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1041 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vect = new double[2];
		
		for (int i = 0; i < 2; i++) {
			vect[i] = sc.nextDouble();
		}
		
		if(vect[0]>0 &&vect[1]>0) {
			System.out.println("Q1");
		}else if(vect[0]<0 &&vect[1]>0) {
			System.out.println("Q2");
		}else if(vect[0]<0 &&vect[1]<0) {
			System.out.println("Q3");
		}else if(vect[0]>0 &&vect[1]<0) {
			System.out.println("Q4");
		}else if(vect[0] == 0 &&vect[1] != 0) {
			System.out.println("Eixo Y");
		}else if(vect[0] !=0 &&vect[1] == 0) {
		System.out.println("Eixo X");
		}else {
			System.out.println("Origem");
		}
		
		sc.close();
	}
}
