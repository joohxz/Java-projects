package fundamentos;

public class DesafioOperadoresAritmeticos {
	public static void main(String[] args) {
		//Variável para conseguir fazer a potência
		int numerador1 = (6 * (3 + 2));
		int Enumerador1 = (int) Math.pow(numerador1, 2);
		//Valor final da primeira equação
		int Rnumerador1 = Enumerador1 / (3 * 2);
		int numerador2 = ((1 - 5) * (2 - 7)) / 2;
		//Valor final segunda equação
		int Rnumerador2 = (int) Math.pow(numerador2, 2);
		int totalNumerador = Rnumerador1 - Rnumerador2;
		int RtotalNumerador = (int) Math.pow(totalNumerador, 3);
		int Rdenominador = (int) Math.pow(10, 3);
		int Final = RtotalNumerador / Rdenominador;
		System.out.println(Final);
	}
}
