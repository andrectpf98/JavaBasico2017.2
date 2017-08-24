import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args){

		Scanner leitor = new Scanner(System.in);

		float valorDiaria = 40;

		float total= 0;

		float taxa;

		int numDiarias = 0;

		String opcao = "sim";

		float totalFinal = 0;

		

		while(opcao == "sim") {

			numDiarias = leitor.nextInt();

			if(numDiarias <10) {

				taxa = 15;

			}else {

				taxa = 8;

			}

			total = (numDiarias*valorDiaria)+taxa;

			System.out.println("Total da conta: "+total);

			totalFinal = total + totalFinal;

			

			System.out.println("Deseja continuar(sim ou nao): ");

			opcao = leitor.next();

			if(opcao == "sim") {

				continue;

			}else {

				break;

			}

		}; 

		System.out.println("O total do dia foi: "+totalFinal);

	

}

}



