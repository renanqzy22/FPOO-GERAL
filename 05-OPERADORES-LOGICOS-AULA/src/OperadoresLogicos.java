
public class OperadoresLogicos {

	public void testesLogicos(){
	
		/*
		 OPERADORES LÓGICOS:
		 && - AND - E
		 || - OR - OU
		 ! - NOT - NÃO
		 
		 EXEMPLO DE SINTAXE:
		 &&
		 */
		
		int idadeInicio = 18;
		int idadeFim = 90;
		boolean resultado;
		
		/*
		 VERIFICA SE A IDADE DA PESSOA ESTÁ ENTRE 18 A 90
		 */
		
		resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		System.out.println(resultado);
		
		idadeInicio = 17;
		resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		System.out.println(resultado);
		
		/*
		 VERIFICA SE A IDADE DA PESSOA ESTÁ ENTRE 18 A 90
		 */
		
		idadeInicio = 18;
		resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		System.out.println(resultado);
		
		idadeInicio = 17;
		resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		System.out.println(resultado);
		
	}
	
}
