package problemas;
import java.util.Scanner;

public class Uri1035 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[4];
		for (int i = 0; i < 4; i++) {
			vect[i] = sc.nextInt();
		}
		
		if(vect[1] > vect[2] && vect[3] > vect[0] && vect[2] + vect[3] > vect[0] + vect[1] && vect[2]>0 && vect[3]>0 && vect[0]%2 ==0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
		sc.close();
	}

}
