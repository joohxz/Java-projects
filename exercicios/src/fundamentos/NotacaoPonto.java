package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		String s = "Bom dia, Brasil";
		System.out.println(s);
		s = s.toUpperCase();
		System.out.println(s);
		s = s.replace("BRASIL", "SENHORA");
		System.out.println(s);
		s = s.concat(" !!!");
		System.out.println(s);
		
		System.out.println("\n\n\n");
		String y = "Boa noite X".replace("X", "Gui").toUpperCase().concat(" !!!\n Victoria te amo!");
		System.out.println(y);
	}
}
