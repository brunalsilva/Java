
public class Cachorro extends Animais {
		
		private String raca;
		private String dieta;
		private String adestracao;
		
		public Cachorro(String nome, int idade, String raca, String dieta, String adestracao)
		{
			super(nome,idade);
			this.raca = raca;
			this.dieta = dieta;
			this.adestracao = adestracao;
		}
		
		public void imprimirInfo()
		{
			System.out.println("\n\t\t\tCachorro \nNome: "+getNome()+"\nIdade: "+getIdade()+"\nRaça: "+raca+"\nDieta: "+dieta+"\nAdestração: "+adestracao);
		}
		
		@Override
		public void som() 
		{
			 System.out.println("Au au au au au!");
		}


		@Override
		public void corre(Boolean corre) 
		{
			if (corre == true) 
			{
				System.out.println("Esse animal corre.");
			}
			else
			{
				System.out.println("Esse animal sobe em árvores.");
			}
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public String getDieta() {
			return dieta;
		}

		public void setDieta(String dieta) {
			this.dieta = dieta;
		}

		public String getAdestracao() {
			return adestracao;
		}

		public void setAdestracao(String adestracao) {
			this.adestracao = adestracao;
		}
		
		
}
