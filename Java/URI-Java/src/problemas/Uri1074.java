package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1074 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			int numero = sc.nextInt();
			
			if (numero %2 == 0 && numero <0) {
			    System.out.println("EVEN NEGATIVE");
			}
			if (numero %2 != 0 && numero >0) {
			    System.out.println("ODD POSITIVE");
			}
			if (numero %2 == 0 && numero >0) {
			    System.out.println("EVEN POSITIVE");
			}
			if (numero %2 != 0 && numero <0) {
			    System.out.println("ODD NEGATIVE");
			}
			if (numero == 0){
			    System.out.println("NULL");
			}
		}
		sc.close();
	}
}
