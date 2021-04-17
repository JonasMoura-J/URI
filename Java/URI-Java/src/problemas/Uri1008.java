package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = horas * valorHora;
		System.out.println("NUMBER = " + numFunc );
		System.out.printf("SALARY = U$ %.2f\n" , salario );
		
		sc.close();
	}
}
