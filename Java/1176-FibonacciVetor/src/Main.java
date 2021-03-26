import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();

		int percentual = 0;
		double percent = 0.0;

		if(salario >=0 && salario <=400.00) {
			percentual = 15;
			percent = 1.15;
		}else if(salario >400.00 && salario <=800.00) {
			percentual = 12;
			percent = 1.12;
		}else if(salario >800.00 && salario <=1200.00) {
			percentual = 10;
			percent = 1.10;
		}else if(salario >1200.00 && salario <=2000.00) {
			percentual = 7;
			percent = 1.07;
		}else if(salario>2000.00) {
			percentual = 4;
			percent = 1.04;
		}
		
		double novoSalario = salario * percent;
		double reajuste = novoSalario - salario;
		
		
		System.out.printf("Novo salario: %.2f\n",novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: " + percentual + " %");
		
	}
}
