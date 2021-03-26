import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int cont2 = 0;
		int n = sc.nextInt();

		while (cont < 10) {
			if (n > 0) {
				cont2 = cont2 + 1;
				cont = cont + 1;
			}
			System.out.println(cont2 + " x " + n + " = " + n * cont2);

		}
		sc.close();
	}
}
