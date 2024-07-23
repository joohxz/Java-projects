package fundamentos;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a sua média: ");
		double media = entrada.nextDouble();
		String resultado = (media >= 7.0) ? "Aprovado" : (media >= 5.0) ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
		entrada.close();
	}

}
