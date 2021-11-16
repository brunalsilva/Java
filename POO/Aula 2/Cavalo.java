
public class Cavalo extends Animais{
		
		private String corPelo;
		private String dieta;
		private String sono;
		
		public Cavalo(String nome, int idade, String som, String locomocao, String corPelo, String dieta, String sono)
		{
			super(nome,idade,som,locomocao);
			this.corPelo = corPelo;
			this.dieta = dieta;
			this.sono = sono;
		}
		
		public void imprimirInfo()
		{
			System.out.println("\n\t\t\tCavalo \nNome: "+getNome()+"\nIdade: "+getIdade()+"\nReproduz som? "+getSom()+"\nDeve correr? "+getLocomocao()+"\nQual a cor do pelo? "+corPelo+"\nQual a dieta? "+dieta+"\nQual o tipo de sono? "+sono);
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
