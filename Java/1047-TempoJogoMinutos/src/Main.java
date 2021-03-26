import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[4];
		for (int i = 0; i < 4; i++) {
			vect[i] = sc.nextInt();
		}
		
		int iniHora = vect[0];
		int iniMin = vect[1];
		int fimHora = vect[2];
		int fimMin = vect[3];
		
		int contHora = 24 - iniHora + fimHora;
		int contMin = 60 - iniMin + fimMin;
		int contaHora = fimHora - iniHora;
		int contaMin = fimMin - iniMin;
		
		int contHoraespecial = -1 - iniHora + fimHora;
		int contMinEspecial = 60 - iniMin + fimMin;
		
		if(iniHora == fimHora && iniMin == fimMin) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}   
		if(iniHora < fimHora && iniMin < fimMin) {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n" ,contaHora, contaMin);
		}
		if(iniHora < fimHora && iniMin > fimMin) {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n" ,contHoraespecial, contMinEspecial);
		}
		if(iniHora > fimHora) {
		    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", contHora, contMin);
		}
		sc.close();
	}

}
