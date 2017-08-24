import java.util.Scanner;

public class Questao5 {

	

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		double litros;

		double valorLitro = 2.5;

		double total;

		

		System.out.println("Digite a quantidade de litros: ");

		litros = leitor.nextDouble();

		

		total = (litros*valorLitro)+6;

		System.out.println("O total foi de: R$"+total);

	}



}



