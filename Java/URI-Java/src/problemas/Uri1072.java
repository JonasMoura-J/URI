package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
			
			if(vect[i]>=10 && vect[i]<=20) {
				in++;
			}else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
		
		
		sc.close();
	}
}
