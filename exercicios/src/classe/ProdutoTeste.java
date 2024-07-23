package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 2544.99;
		p1.desconto = 0.10;
		
		
		var p2 = new Produto();
		p2.nome = "Caneta preta BIC";
		p2.preco = 1.99;
		p2.desconto = 0;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoF1 = p1.preco * (1 - p1.desconto);
		double precoF2 = p2.preco * (1 - p2.desconto);
		double Carrinho = (precoF1 + precoF2);
		
		System.out.println(precoF1 + "reais");
		System.out.println(precoF2 + "reais");
		
		System.out.println(Carrinho + "reais");
		
	}
}