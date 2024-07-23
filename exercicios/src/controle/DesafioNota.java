package controle;

import java.util.Scanner;

public class DesafioNota {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número abaixo entre 0 e 10 e verifique se ele é par!");
		int num = entrada.nextInt();
		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
				System.out.printf("Num: %d é par\n", num);
			}
			else {
				System.out.printf("Num: %d é ímpar\n", num);
			}
		}
		entrada.close();
	}
}
