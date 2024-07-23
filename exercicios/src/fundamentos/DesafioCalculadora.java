package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		String Enum1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		//Passa string para double
		double num1 = Double.parseDouble(Enum1);
		String Enum2 = JOptionPane.showInputDialog("\nDigite o segundo número: ");
		//Passa string para double
		double num2 = Double.parseDouble(Enum2);
		String entrada = JOptionPane.showInputDialog("Digite a sua operação: ");
		
		//Declarando as possibilidades
		String menos = "-";
		boolean resultMe = menos.equals(entrada);
		String mais = "+";
		boolean resultMa = mais.equals(entrada);
		String multiplica = "*";
		boolean resultMu = multiplica.equals(entrada);
		
		double resultado = (resultMa) ? (num1 + num2) : (resultMe) ? (num1 - num2) : (resultMu) ? (num1 * num2) : (num1 / num2);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(entrada);
		
		System.out.printf("O resultado de %.1f %s %.1f eh igual a %.1f", num1, entrada, num2, resultado);
		
	}
}
