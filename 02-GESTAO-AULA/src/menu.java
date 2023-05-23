import java.util.Scanner;

public class menu {
	Scanner scanner = new Scanner(System.in);
	
	professor objProfessor;
	aluno objAluno;
	disciplina objDisciplina;
	media objMedia;

	
	public void exibirMenu() {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		while(opcao != 6) {
		
		System.out.println("ESCOLHA UMA OPÇÃO PELO NUMERO: ");
		System.out.println("1 CADASTRAR PROFESSOR ");
		System.out.println("2 CADRASTRAR ALUNO ");
		System.out.println("3 CADRASTRAR DISCIPLINA ");
		System.out.println("4 CADRASTRAR NOTA ");
		System.out.println("5 EXIBIR DADOS ");
		System.out.println("6 SAIR ");
		
		opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("DIGITE O NOME DO PROFESSOR: ");
			objProfessor = new professor();
			objProfessor.setNomeProfessor(scanner.next());
			
			break;
			
		case 2:
			System.out.println("DIGITE O NOME DO ALUNO: ");
			objAluno = new aluno();
			objAluno.setNomeAluno(scanner.next());
			break;
					
		case 3:
			System.out.println("DIGITE O NOME DO DISCIPLINA: ");
			objDisciplina = new disciplina();
			objDisciplina.setNomeDisciplina(scanner.next());
			break;
			
		case 4:
			System.out.println("DIGITE A NOTA: ");
			objMedia = new media();
			
			System.out.println("NOTA 1: ");
			objMedia.setNota1(scanner.nextFloat());
			
			System.out.println("NOTA 2: ");
			objMedia.setNota2(scanner.nextFloat());
			
			System.out.println("NOTA 3: ");
			objMedia.setNota3(scanner.nextFloat());
			
			System.out.println("NOTA 4: ");
			objMedia.setNota4(scanner.nextFloat());
			
			
			break;
			
		case 5:
			System.out.println("EXIBIR DADOS: ");
			System.out.println("PROFESSOR : " + objProfessor.getNomeProfessor());
			System.out.println("ALUNOS: " + objAluno.getNomeAluno());
			System.out.println("DISCIPLINA: " + objDisciplina.getNomeDisciplina());
			System.out.println("MEDIA: " + objMedia.CalcularMedia());
			break;
			
		case 6:
			System.out.println(" OBRIGADO POR ACESSAR O SITE  ");
			break;
			
		default:
			System.out.println(" OPÇÃO INVALIDA ");
			break;
			
			}
		}
	}

}
