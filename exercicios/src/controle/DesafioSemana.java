package controle;

import java.util.Scanner;

public class DesafioSemana {
	public static void main(String[] args) {
		//Abertura do Scanner
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um dia da semana: ");
		String dia = entrada.nextLine();
		
		//Declarando variáveis
		String domingo = "domingo";
		String segunda = "segunda";
		String terca = "terça";
		String quarta = "quarta";
		String quinta = "quinta";
		String sexta = "sexta";
		String sabado = "sábado";
		
		//Condicionais
		if (dia.equalsIgnoreCase(domingo)) {
			System.out.println("1");
		}
		else if (dia.equalsIgnoreCase(segunda)) {
			System.out.println("2");
		}
		else if (dia.equalsIgnoreCase(terca)) {
			System.out.println("3");
		}
		else if (dia.equalsIgnoreCase(quarta)) {
			System.out.println("4");
		}
		else if (dia.equalsIgnoreCase(quinta)) {
			System.out.println("5");
		}
		else if (dia.equalsIgnoreCase(sexta)) {
			System.out.println("6");
		}
		else if (dia.equalsIgnoreCase(sabado)) {
			System.out.println("7");
		}
		else {
			System.out.println("Entrada inválida, tente novamente!");
		}
		//Fechamento do Scanner
		entrada.close();
		
	}
}
