
public class Cavalo extends Animais{
		
		private String corPelo;
		private String dieta;
		private String sono;
		
		public Cavalo(String nome, int idade, String corPelo, String dieta, String sono)
		{
			super(nome,idade);
			this.corPelo = corPelo;
			this.dieta = dieta;
			this.sono = sono;
		}
		
		@Override
		public void som() 
		{
			 System.out.println("Tuctuctuctuc!");
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
		
		public void imprimirInfo()
		{
			System.out.println("\n\t\t\tCavalo \nNome: "+getNome()+"\nIdade: "+getIdade()+"\nQual a cor do pelo? "+corPelo+"\nQual a dieta? "+dieta+"\nQual o tipo de sono? "+sono);
		}

		public String getCorPelo() {
			return corPelo;
		}

		public void setCorPelo(String corPelo) {
			this.corPelo = corPelo;
		}

		public String getDieta() {
			return dieta;
		}

		public void setDieta(String dieta) {
			this.dieta = dieta;
		}

		public String getSono() {
			return sono;
		}

		public void setSono(String sono) {
			this.sono = sono;
		}
		
		
}
