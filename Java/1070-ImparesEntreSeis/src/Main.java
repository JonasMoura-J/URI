import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			num +=1;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(num);
			num+=2;
		}
		sc.close();
	}
}
