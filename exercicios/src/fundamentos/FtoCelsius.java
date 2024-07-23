package fundamentos;

public class FtoCelsius {
	public static void main(String[] args) {
		// Fórmula de F para C
		// (F - 32) x 5/9 = C
		double Farenheimt = 32.0;
		final double divisao = 5.0/9.0;
		final double menos = 32.0;
		double Celsius = (Farenheimt - menos) * divisao;
		System.out.println(Farenheimt + " F convertido para graus Celsius eh igual a : " + Celsius);
		Farenheimt = 89.6;
		Celsius = (Farenheimt - menos) * divisao;
		System.out.println(Farenheimt + " F convertido para graus Celsius eh igual a : " + Celsius);
	}
}
