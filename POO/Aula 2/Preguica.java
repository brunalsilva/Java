
public class Preguica extends Animais {

		private String regiao;
		private String corPelos;
		
		public Preguica(String nome, int idade, String som, String locomocao, String regiao, String corPelos)
		{
			super(nome,idade,som,locomocao);
			this.regiao = regiao;
			this.corPelos = corPelos;
		}
		
		public void imprimirInfo()
		{
			System.out.println("\n\t\t\tPreguiça \nNome: "+getNome()+"\nIdade: "+getIdade()+"\nReproduz som? "+getSom()+"\nDeve correr? "+getLocomocao()+"\nQual a região de origem? "+regiao+"\nQual a cor do pelo? "+corPelos);
		}

		public String getRegiao() {
			return regiao;
		}

		public void setRegiao(String regiao) {
			this.regiao = regiao;
		}

		public String getCorPelos() {
			return corPelos;
		}

		public void setCorPelos(String corPelos) {
			this.corPelos = corPelos;
		}
		
		
}
