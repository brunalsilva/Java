package pooaula1;

public class ex3elet {
		/*Crie uma classe produto eletrônico e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto produto eletrônico,
		defina as instancias deste objeto e apresente as informações deste objeto
		no console.*/
	
		private String tipo;
		private String marca;
		private String cor;
		private int ano;
		
		public ex3elet (String tipo, String marca, String cor, int ano)
		{
			this.tipo = tipo;
			this.marca = marca;
			this.cor = cor;
			this.ano = ano;
		}
		
		public void imprimirDados()
		{
			System.out.println("\n"+tipo+"\n"+marca+"\n"+cor+"\n"+ano);
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
}
