package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[2];
		for (int i = 0; i < 2; i++) {
			vect[i] = sc.nextInt();
		}
		
		int ini = vect[0];
		int fim = vect[1];
		
		int cont = 24 - ini + fim;
		int conta = fim - ini;
		
		if(ini == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}   
		if(ini < fim) {
			System.out.printf("O JOGO DUROU %d HORA(S)\n" ,conta);
		}    
		if(ini > fim) {
		    System.out.printf("O JOGO DUROU %d HORA(S)\n", cont);
		}
		sc.close();
	}

}
