package controle;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		//Abertura do Scanner
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite qual é a sua faixa no Jiu Jitsu: ");
		String valor = entrada.nextLine();
		switch (valor.toLowerCase()) {
		case "preta":
			System.out.println("\nVocê é faixa preta!\nMestre!");
			break;
		case "branca":
			System.out.println("Você é um iniciante!\nPratique para evoluir!");
			break;
		case "amarela":
			System.out.println("Já possui conhecimento acima do iniciante!\nContinue evoluindo!");
			break;
		case "vermelha":
			System.out.println("Você é um perito!\nParabéns!");
			break;
		case "roxo":
			System.out.println("Você está quase na faixa preta!\nContinue lá!");
			break;
		default:
			System.out.println("Não sabe ainda nada!\nEntre para familia BJJ!");
		}
		
		//Fechamento do Scanner
		entrada.close();
	}
}
