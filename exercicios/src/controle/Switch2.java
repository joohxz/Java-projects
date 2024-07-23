package controle;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		System.out.print("Digite sua nota: ");
		int nota = entrada.nextInt();
		switch (nota) {
		case 10:
			conceito = "A+";
			break;
		case 9:
			conceito = "A";
			break;
		case 8:
			conceito = "B+";
			break;
		case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "F";
			break;
		default:
			System.out.println("Não foi informado");
		}
		if (nota >= 0 && nota <= 10) {
			System.out.printf("\nSua nota foi %d e conceito %s !!!", nota, conceito);
		}
	}
}
