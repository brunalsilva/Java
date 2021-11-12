package pooaula1;

public class ex2aviao {
		/*Crie uma classe avião e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto avião, defina as instancias deste
		objeto e apresente as informações deste objeto no console.*/
	
		private String tipo;
		private String modelo;
		private String ciaAerea;
		private int ano; 
		
		public ex2aviao(String tipo, String modelo, String ciaAerea, int ano)
		{
			this.tipo = tipo;
			this.modelo = modelo;
			this.ciaAerea = ciaAerea;
			this.ano = ano;
		}
		
		public void imprimirInfo()
		{
			System.out.println("\n"+tipo+"\n"+modelo+"\n"+ciaAerea+"\n"+ano);
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getCiaAerea() {
			return ciaAerea;
		}

		public void setCiaAerea(String ciaAerea) {
			this.ciaAerea = ciaAerea;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
}
