import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salario = sc.nextDouble();
		double totVendas = sc.nextDouble();
		
		double comissao = totVendas*0.15;
		
		double salarioFinal = salario + comissao;
		
		System.out.printf("TOTAL = R$ %.2f\n" , salarioFinal );
		
		sc.close();
	}
}
