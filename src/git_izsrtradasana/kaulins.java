package git_izsrtradasana;

import java.util.Random;
import java.util.Scanner;

public class kaulins {
	static void mestKaulinu(int reiz) {
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
	}
}
