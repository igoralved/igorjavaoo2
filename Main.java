package src;

public class Main {
//exercicio 16
	public static void main(String args[]) {
		System.out.println("\f");
		Livro l = new Livro("Harry Potter", 10.0);
		Pessoa p = new Pessoa("Sofia", 24);
		Emprestimo e = new Emprestimo(l, p);
		e.emprestarlivropara();
	}
	
}
