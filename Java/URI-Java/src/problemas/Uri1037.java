package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();

		System.out.println((num >= 0 && num <= 25)?"Intervalo [0,25]":(num > 25 && num <= 50)?"Intervalo (25,50]":
			(num > 50 && num <= 75)?"Intervalo (50,75]":(num > 75 && num <= 100)?"Intervalo (75,100]":"Fora de intervalo");
		sc.close();
	}
}
