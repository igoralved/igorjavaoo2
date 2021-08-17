package src;

public class Emprestimo {

	public Livro livroemprestado;
	public Pessoa pessoaquepegouemprestado;
	
	public Emprestimo(Livro l, Pessoa p) {
		this.livroemprestado = l;
		this.pessoaquepegouemprestado = p;
	}
	
	public Livro getLivro() {
		return livroemprestado;
	}
	
	public void setLivro(Livro l) {
		this.livroemprestado = l;
	}
	
	public void setPessoa(Pessoa p) {
		this.pessoaquepegouemprestado = p;
	}
	
	public Pessoa getPessoa() {
		return pessoaquepegouemprestado;
	}

	public void emprestarlivropara() {
		System.out.println("O livro " + livroemprestado.getNome() + 
				" foi emprestado para " + pessoaquepegouemprestado.getNome());
	}
	
	
	
	
}
