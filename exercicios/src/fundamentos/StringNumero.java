package fundamentos;

import javax.swing.JOptionPane;

public class StringNumero {
	public static void main(String[] args) {
		String valor0 = JOptionPane.showInputDialog("Digite a matricula do aluno: ");
		String valor1 = JOptionPane.showInputDialog("Digite sua primeira nota:");
		String valor2 = JOptionPane.showInputDialog("Digite sua segunda nota:");
		
		Integer matricula = Integer.parseInt(valor0);
		float numero1 = (float) Double.parseDouble(valor1);
		float numero2 = (float) Double.parseDouble(valor2);
		float media = (float) (numero1 + numero2)/2;
		if (media >= 6) {
			System.out.printf("O aluno da matricula %d, com as notas %.2f e %.2f obteve media igual a %.2f\nAPROVADO!", matricula, numero1, numero2, media);
			
		} else {
			System.out.printf("O aluno da matricula %d, com as notas %.2f e %.2f obteve media igual a %.2f\nREPROVADO!", matricula, numero1, numero2, media);
			
		}
	}
}
