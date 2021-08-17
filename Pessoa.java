package src;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double salario;
	
	public Pessoa(String n, int i) {
		this.nome = n;
		this.idade = i;
		this.salario = 0;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
}
