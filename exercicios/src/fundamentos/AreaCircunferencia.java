package fundamentos;

public class AreaCircunferencia {
	public static void main (String [] args) {
		//Atribuição as variáveis 'raio' e 'pi'
		double raio = 3.4;
		final double PI = 3.14159;
		//Cálculo da área
		double area = PI * raio * raio;
		//Imprime o resultado da área
		System.out.println(area);
		raio = 10;
		area = PI * raio * raio;
		System.out.println("área = " + area + "m²");
	}
}
