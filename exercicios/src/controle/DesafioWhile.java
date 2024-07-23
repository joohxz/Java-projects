package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		//Abertura do Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Declarando variáveis
		double nota = 0;
		double sumNotas = 0;
		int countNotas = 0;
		
		while (nota != -1) {
			System.out.println("Digite uma nota: ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10 ) {
				sumNotas += nota;
				countNotas++;
			} else if (nota != -1) {
				System.out.println("Digite um nota entre 0 e 10.");
			}
		}
		double media = sumNotas / countNotas;
		System.out.printf("Foram somadas %d notas\nO valor total é %.2f\nA média das notas é igual a %.2f \nO ultimo valor de nota é %.2f\n", countNotas, sumNotas, media, nota);
		
		//Fechamento do Scanner
		entrada.close();
	}
}