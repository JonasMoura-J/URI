package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1051 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();

		if (x <= 2000.0){
		    System.out.printf("Isento\n");

		}
		if (x > 2000 && x <= 3000){
		    double y = x-2000;
		    double per = y*0.08;
		    System.out.printf("R$ %.2f\n" ,per);
		    
		}
		if (x > 3000 && x <= 4500.0){
			double per = (x-3000)*0.18+80;
		    System.out.printf("R$ %.2f\n" ,per);
		    
		}
		if (x > 4500){
			double per2 = (x-4500)*0.28 + 80 + 270;
		    System.out.printf("R$ %.2f\n" ,per2);
		}
		sc.close();
	}
}
