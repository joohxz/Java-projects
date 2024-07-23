package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		//abertura do Scanner
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu primeiro salario: ");
		String valor1 = entrada.nextLine();
		int posicao1 = valor1.indexOf(",");
		if (posicao1 != -1) {
			valor1 = valor1.replace(",", ".");
		}
		System.out.println("Digite seu segundo salario: ");
		String valor2 = entrada.nextLine();
		int posicao2 = valor2.indexOf(",");
		if (posicao2 != -1) {
			valor2 = valor2.replace(",", ".");
		}
		System.out.println("Digite seu terceiro salario: ");
		String valor3 = entrada.nextLine();
		//Verifica a existência de virgula na entrada
		int posicao3 = valor3.indexOf(",");
		//Trata a existência de vírgula na entrada, se houver, será reposta.
		if (posicao3 != -1) {
			valor3 = valor3.replace(",", ".");
		}
		//Transforma as strings em números, no caso, Double.
		Double salario1 = Double.parseDouble(valor1);
		Double salario2 = Double.parseDouble(valor2);
		Double salario3 = Double.parseDouble(valor3);
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.printf("A media dos tres salarios, respectivos: %.2f, %.2f, %.2f.\n eh igual a %.2f", salario1, salario2, salario3, media);
		// Fechamento do Scanner
		entrada.close();
	}
}
