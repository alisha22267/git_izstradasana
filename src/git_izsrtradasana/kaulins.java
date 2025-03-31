package git_izsrtradasana;

import java.util.Random;

public class kaulins {
	static void mestKaulinu(int reiz) {
		int sk;
		Random rand =  new Random();
		for(int i=0; i<reiz; i++) {
			sk = rand.nextInt(6)+1;
			System.out.println("Skaitlis uzkrita: " +sk);
		}
	}

	public static void main(String[] args) {
		mestKaulinu(3);

	}

}
