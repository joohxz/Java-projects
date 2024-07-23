package fundamentos;

public class DesafioLogica {
	public static void main(String[] args) {
		//Trabalho na terça V ou F
		//Trabalho na quinta V ou F
		boolean trabalhoterca = true;
		boolean trabalhoquinta = true;
		
		//True se os dois trabalhos derem certo
		boolean ComprouTV50 = trabalhoterca && trabalhoquinta;
		//Se os dois derem certo, dá errado, pois há a condição implicita
		boolean ComprouTV32 = trabalhoterca ^ trabalhoquinta;
		//Só comprou o sorvete se algum dos dois trabalhos deu certo
		boolean ComprouSorvete = trabalhoterca || trabalhoquinta;
		//Negação do comprou sorvete
		boolean maisSaudavel = !ComprouSorvete;
		String resultadoSaudavel = maisSaudavel ? "sim" : "não";
		
		System.out.println(ComprouTV50);
		System.out.println(ComprouTV32);
		System.out.println(ComprouSorvete);
		System.out.println("Mais saudavel? " + resultadoSaudavel);
	}

}
