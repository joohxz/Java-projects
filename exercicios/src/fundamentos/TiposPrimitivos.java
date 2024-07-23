package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações de um funcionário
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short Voos = 542;
		int id = 456213;
		long pontosAcumulados = 4_000_000_000L;
		
		//Tipos numericos reais
		float salario = 1416.56F;
		double vendaAcumuladas = 3_000_000_000.01;
		
		//Tipo booleano;
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(Voos / 2);
	
		//Pontos por real
		System.out.println(pontosAcumulados / vendaAcumuladas);
	
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? = " + estaDeFerias);
	}
}
