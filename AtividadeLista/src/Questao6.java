import java.util.Scanner;
public class Questao6 {
	
	public static void main(String[] args){

		

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o sal�rio bruto:");

		float salario = leitor.nextFloat();

		System.out.println("Digite o valor da Presta��o:");

		float prestacao = leitor.nextFloat();

		

		if (prestacao <= (salario * 0.3)){

			

			System.out.println("O empr�stimo pode ser concedido");

			

		}else{

			System.out.println("O empr�stimo n�o pode ser concedido");

			

		}

		

	}


}
