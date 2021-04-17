package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double totVendas = sc.nextDouble();
		
		double comissao = totVendas*0.15;
		
		double salarioFinal = salario + comissao;
		
		System.out.printf("TOTAL = R$ %.2f\n" , salarioFinal );
		
		sc.close();
	}
}
