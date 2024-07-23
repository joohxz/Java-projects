package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Boa tarde!".charAt(0));
		
		String str = "Boa noite";
		System.out.println(str.concat("!!!"));
		System.out.println(str + "!!!");
		System.out.println(str.startsWith("Boa"));
		System.out.println(str.endsWith("noite"));
		System.out.println(str.equalsIgnoreCase("BOA NOITE"));
		
		var nome = "Pedro";
		var sobrenome = "Moraes";
		var idade = 28;
		var salario = 1456.16;
		System.out.printf("Nome: %s %s de idade igual a %d anos e ganha mensalmente %.2f reais.", nome, sobrenome, idade, salario);
	}
}
