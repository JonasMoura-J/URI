import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int maior = num > num2 ? num : num2;
		int menor = num > num2 ? num2 : num;
		
		int soma = 0;
		
		for (int i = menor+1; i < maior; i++) {
			if(i%2 !=0) {
				soma+=i;
			}
		}
		System.out.println(soma);
		sc.close();
	}
}
