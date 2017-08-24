import java.util.Scanner;
public class Questa1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float valorSalario;
		float aumento;
		
		System.out.println("Digite o valor do salario: ");
		valorSalario = leitor.nextFloat();
		
		System.out.println("Digite o valor do aumento: ");
		aumento = leitor.nextFloat();
		
		valorSalario += (valorSalario*(aumento/100));
		
		System.out.println("Valor novo salario: "+valorSalario);
		System.out.println("Aumento de "+aumento+"%");
	}
}
