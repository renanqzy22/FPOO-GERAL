package atividades;
import java.util.Scanner;
public class AtividadeP {
	
	public void A1() {
		Scanner objscanner = new Scanner(System.in);
		
		int NP = "";
		int soma = 0;
		
		while (!NP >= 0) {
			
			System.out.print("DIGITE NUMEROS POSITIVOS");
			NP = objscanner.next();
			
		soma = soma + NP;
			
		}
		
		System.out.print("SEU VALOR TOTAL É: " + NP);
	}
}
