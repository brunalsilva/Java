package pooaula1;

public class ex1clientes {
	/*Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/

	private String nomeCliente;
	private String sobrenomeCliente;
	private String profissao;
	private int idade;
	
	public ex1clientes(String nomeCliente, String sobrenomeCliente, String profissao, int idade)
	{
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.profissao = profissao;
		this.idade = idade;
	}
	
	public void imprimirDados()
	{
		System.out.println("\n"+nomeCliente+" "+sobrenomeCliente+" tem "+idade+" anos e é "+profissao+".");
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}

	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
