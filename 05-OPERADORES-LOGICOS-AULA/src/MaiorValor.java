
public class MaiorValor {

	int n1 = 5;
	int n2 = 3;
	int n3 = 8;
	
	public void verificarMaior1() {
		
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println("N1 É O MAIOR VALOR");
			}
		}
		
		if(n2 > n1) {
			if(n2 > n3) {
				System.out.println("N2 É O MAIOR VALOR");
			}
		}
		
		if(n3 > n1) {
			if(n3 > n2) {
				System.out.println("N3 É O MAIOR VALOR");
			}
		}
		
		
	}
	
}
