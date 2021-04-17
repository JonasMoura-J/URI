package problemas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1049 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		
		if(a.equals("vertebrado")) {
			if(b.equals("ave")){
				if(c.equals("carnivoro")) {
					System.out.println("aguia");
				}
				if(c.equals("onivoro")) {
					System.out.println("pomba");
				}
			}
			if(b.equals("mamifero")) {
				if(c.equals("onivoro")) {
					System.out.println("homem");
				}
				if(c.equals("herbivoro")) {
					System.out.println("vaca");
				}
			}
		}
		if(a.equals("invertebrado")) {
			if(b.equals("inseto")){
				if(c.equals("hematofago")) {
					System.out.println("pulga");
				}
				if(c.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			}
			if(b.equals("anelideo")) {
				if(c.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				if(c.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
		sc.close();
	}
}
