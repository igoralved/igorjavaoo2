package src;

public class Livro {

	private String nome;
	private double preco;
	
	public Livro(String n, double p) {
		this.nome = n;
		this.preco = p;
	}
	
	public double getPreco() {
		return this.preco;
	}

	public String getNome() {
		return this.nome;
	}
	
}
