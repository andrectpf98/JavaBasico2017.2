import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		float nota1;

		float nota2;

		float mediaAluno;

		float mediaClasse = 0;

		int numAprovados = 0;

		int numFinal = 0;

		int numReprovados = 0;

		int totalExame;

		

		

		for(int i=0; i<=6; i++) {

			System.out.println("Digite nota 1: ");

			nota1 = leitor.nextFloat();

			System.out.println("Digite a nota 2: ");

			nota2 = leitor.nextFloat();

			mediaAluno = (nota1+nota2)/2;

			mediaClasse = (mediaClasse+mediaAluno)/2;

			if(mediaAluno >=7) {

				System.out.println("Media: "+mediaAluno);

				System.out.println("Aprovado!");

				numAprovados+=1;

			}else if(mediaAluno > 3 && mediaAluno < 7) {

				System.out.println("Esta na Final!");

				numFinal+=1;

			}else {

				System.out.println("Reprovou");

				numReprovados += 1;

			}

			

		

		

		}

		System.out.println("Media Classe: "+mediaClasse);

		System.out.println("Aprovados: "+numAprovados);

		System.out.println("Finais: "+numFinal );

		System.out.println("Reprovados: "+numReprovados);

		

		

	}

}



