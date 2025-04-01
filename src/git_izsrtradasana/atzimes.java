package git_izsrtradasana;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class atzimes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] opcijas = {"matematika", "lat.valoda", "ang.valoda", "programmesana"};
		String izv;
		int[] stud1 = new int[5];
		int[] stud2 = new int[5];
		int[] stud3 = new int[5];
		
		for(int i=0; i<stud1.length; i=i+2) {
			stud1[i] = 2;
		}
		for(int i=0; i<stud1.length; i=i+3) {
			stud1[i] = 4;
		}
		for(int i=0; i<stud1.length; i=i+1) {
			stud1[i] = 1;
		}
		
		do {
			izv = (String)JOptionPane.showInputDialog(null,
			"Izveles darbibu", "Darbibas izvele", 
			JOptionPane.QUESTION_MESSAGE, null, opcijas, opcijas[0]);
			//lai novert error kad spiez cancel
			if(izv == null)
				break;
			
			
			
			
		} while(!izv.equals("Apturet"));

	}

}
