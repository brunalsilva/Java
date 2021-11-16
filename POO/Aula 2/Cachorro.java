
public class Cachorro extends Animais {
		
		private String raca;
		private String dieta;
		private String adestracao;
		
		public Cachorro(String nome, int idade, String som, String locomocao, String raca, String dieta, String adestracao)
		{
			super(nome,idade,som,locomocao);
			this.raca = raca;
			this.dieta = dieta;
			this.adestracao = adestracao;
		}
		
		public void imprimirInfo()
		{
			System.out.println("\n\t\t\tCachorro \nNome: "+getNome()+"\nIdade: "+getIdade()+"\nReproduz som? "+getSom()+"\nDeve correr? "+getLocomocao()+"\nQual a raça? "+raca+"\nQual a dieta? "+dieta+"\nÉ adestrado? "+adestracao);
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
