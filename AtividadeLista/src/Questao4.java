import java.util.Scanner;
public class Questao4 {
	public static void main(String[] args) {

		float resultado;

		float salario;

		String nome;

		Scanner leitor = new Scanner(System.in);

		

		System.out.println("Deseja continuar ? S/N ");

		nome = leitor.nextLine();

		

	    System.out.println("Digite o valor do salario: ");

		salario = leitor.nextFloat();

		

		

		while (nome == "N"){

			

			if (salario <= 500){

				resultado = (float) ((salario * 0.2) + salario);

				System.out.println("O salario com o reajuste �: " + resultado);

			}

			else{

				System.out.println("Voce n�o tem direito ao aumento!");

			}

		}

		

		

		

	}



}
