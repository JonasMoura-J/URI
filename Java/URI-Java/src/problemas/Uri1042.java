package problemas;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Uri1042 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vectDesordenado = new int[3];
		int[] vectOrdenado = new int[3];
		
		for (int i = 0; i < 3; i++) {
			vectDesordenado[i] = sc.nextInt();
			vectOrdenado[i] = vectDesordenado[i];
		}
		
		Arrays.sort(vectOrdenado);
		
		for (int i : vectOrdenado) {
			System.out.println(i);
		}
		System.out.println();
		for (int i : vectDesordenado) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
