package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1016 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		int dis = x*2;
		System.out.println(dis +" minutos");
		sc.close();
	}
}
