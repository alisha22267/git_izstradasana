package git_izsrtradasana;

import java.util.Random;
import java.util.Scanner;

public class kaulins {
	static void mestKaulinu(int reiz) {
<<<<<<< HEAD
		int sk, reizes;
		Random rand =  new Random();
		Scanner scan = new Scanner(System.in);
			System.out.println("Cik reizes mest kaulinu? ");
			reizes = scan.nextInt();
			scan.close();
			for(int i=0; i<reizes; i++) {
				sk = rand.nextInt(6)+1;
				System.out.println("Skaitlis uzkrita: "+sk);
			}
=======
		int sk;
		Random rand =  new Random();
		for(int i=0; i<reiz; i++) {
			sk = rand.nextInt(6)+1;
			System.out.println("Skaitlis uzkrita: " +sk);
		}
	}

	public static void main(String[] args) {
		mestKaulinu(3);

>>>>>>> testazars
	}
}
