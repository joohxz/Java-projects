package fundamentos;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		//Valor de 'a' na tabela ASC
		System.out.println(a == b);
		
		double nota = 7.5;
		boolean bomComportamento = true;
		boolean corteMedia = (nota >= 7);
		
		System.out.printf("Tem bolsa de estudos?\nCondições:\nTem bom comportamento? %b\nEstá igual ou acima da média? %b\n", bomComportamento, corteMedia);
	}
}
