package controle;

public class DesafioFOR {
	public static void main(String[] args) {
		//Abertura do Scanner
		//Scanner entrada = new Scanner(System.in);
		
		String valor = "#";
		for (int i = 0; i < 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		System.out.println("\n");
		
		String valor2 = "#";
		for(; !valor2.equals("######") ; valor2 += "#") {
			System.out.println(valor2);
		}
	}
}
