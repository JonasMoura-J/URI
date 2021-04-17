package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1061 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			System.out.print("Dia ");
			double dia = sc.nextDouble();
			String tempo = sc.next();
			
			String[] tempoSeparado = tempo.split(" : ");
			
		}
		sc.close();
	}
}
