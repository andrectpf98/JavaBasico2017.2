import java.util.Scanner;

public class Questao9 {

	

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		String saida;

		String nomePaciente;
		String sexo;
		float peso;
		float altura;
		int idade;
		int quantidadePaciente = 0;
		boolean opcao = true;
		
		int contMulherCheideCoisa = 0;
		float mediaIdadeHomens = 0;
		int contHomens = 0;
		int contJovem = 0;
		int idadeMaisVelho = 0;
		float alturaMaisBaixa = 0;
		
		String nomeMaisBaixa = null;
		String nomeMaisVelho = null;
		
		int[] idadeHomens = new int[1000];

		while(opcao == true) {
			//inicializaçao paciente
			System.out.println("Digite o nome do paciente: ");

			nomePaciente = leitor.next();

			System.out.println("Digite o sexo(H ou F namoralzinha :D): ");

			sexo = leitor.next();

			System.out.println("Digite o peso: ");

			peso = leitor.nextFloat();

			System.out.println("Digite a altura: ");

			altura = leitor.nextFloat();

			System.out.println("Digite a idade: ");

			idade = leitor.nextInt();

			
			//adicionar idade homem a lista
			if(sexo == "H") {

				idadeHomens[contHomens] = idade;
				contHomens+=1;
			}
			
			//define mulher chei de coisa
			if((sexo == "F") && (altura >= 1.6) && (altura <= 1.7) && (peso >70)){
				contMulherCheideCoisa+=1;
			}
			
			//incrementa a contagem de jovem
			if(idade >=18 && idade <=25){
				contJovem += 1;
			}
			
			//define o mais velho
			if (idadeMaisVelho < idade){
				idadeMaisVelho = idade;
				nomeMaisVelho = nomePaciente;
			}
			
			//define a mulher mais baixa
			if(sexo == "F" && alturaMaisBaixa < altura){
				alturaMaisBaixa = altura;
				nomeMaisBaixa = nomePaciente;
			}
			//incrementa paciente
			quantidadePaciente+=1;
			
			//saida do loop
			System.out.println("Deseja informar outro paciente: sim ou nao?");
			saida = leitor.next();
			
			if(saida == "sim"){
				opcao = true;
			}else{
				opcao = false;
			}
			
		}
		//media das idades dos homens
		for(int idadeLoop : idadeHomens){
			mediaIdadeHomens = mediaIdadeHomens + idadeLoop;
		}
			mediaIdadeHomens = (mediaIdadeHomens)/contHomens;
			
			//saida dos dados
			System.out.println("A quantidade de pacientes: "+ quantidadePaciente);
			System.out.println("A media das idades dos homens: "+ mediaIdadeHomens);
			System.out.println("Quantidade mulheres com altura entre 1,6 e 1,7 e peso acima de 70: "+ contMulherCheideCoisa);
			System.out.println("A quantidade de jovens: "+contJovem);
			System.out.println("O paciente mais velho: "+ nomeMaisVelho);
			System.out.println("A mulher mais baixa: "+nomeMaisBaixa);

}

}
