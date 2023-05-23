import java.util.Scanner;


public class LoopWhileSentila {

	public void LoopWhile() {
		
		Scanner objscanner = new Scanner(System.in);
		
		String Sentinela = "";
		
		while (!Sentinela.equalsIgnoreCase("sair")) {
			
			System.out.print("DIGITE UM VALOR OU SAIR");
			Sentinela = objscanner.next();
		}
		
		System.out.print("OBRIGADO POR USAR O PROGRAMA :D");
	}
}
