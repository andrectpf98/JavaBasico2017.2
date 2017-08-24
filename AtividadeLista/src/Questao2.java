import java.util.Scanner;
public class Questao2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite o valor a ser feito a tabuada: ");
		valor = leitor.nextInt();
		
		for(int i =0; i<10;i++){
			System.out.println("["+i+" x "+valor+" = "+(valor*i)+"]");
			
		}
		
	}
}
