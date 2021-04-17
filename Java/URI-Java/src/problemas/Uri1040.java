package problemas;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.#");
		
		double[] vect = new double[4];
		for (int i = 0; i < 4; i++) {
			vect[i] = sc.nextDouble();
			String s = df.format(vect[i]);
			vect[i] = Double.parseDouble(s);
		}
		double notaex = 0;
		
		double m = ((vect[0]*2.0 + vect[1]*3.0 + vect[2]*4.0 + vect[3]*1.0)/10.0);
		String s = df.format(m);
		double media = Double.parseDouble(s);
		System.out.printf("Media: %.1f\n", media);
		if(media>= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		if(media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		if(media >= 5.0 && media < 7.0) {
			System.out.println("Aluno em exame.");
			
			notaex = sc.nextDouble();
			
			double novaMedia = (media+notaex)/2;
			System.out.printf("Nota do exame: %.1f\n", notaex);
			if(novaMedia>= 5.0) {
				System.out.println("Aluno aprovado.");
			}else if(novaMedia < 5.0){
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", novaMedia);
		}
		sc.close();
	}
}
