package fundamentos;

import java.util.Scanner;

public class DesafioConversao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu primeiro salario: ");
        String valor1 = entrada.nextLine();
        valor1 = valor1.replace(",", ".");

        System.out.println("Digite seu segundo salario: ");
        String valor2 = entrada.nextLine();
        valor2 = valor2.replace(",", ".");

        System.out.println("Digite seu terceiro salario: ");
        String valor3 = entrada.nextLine();
        valor3 = valor3.replace(",", ".");

        try {
            Double salario1 = Double.parseDouble(valor1);
            Double salario2 = Double.parseDouble(valor2);
            Double salario3 = Double.parseDouble(valor3);

            double media = (salario1 + salario2 + salario3) / 3;

            System.out.printf("A média dos três salários, respectivamente: %.2f, %.2f, %.2f, é igual a %.2f", salario1, salario2, salario3, media);
        } catch (NumberFormatException e) {
            System.out.println("Formato de salário inválido.");
        }

        entrada.close();
    }
}