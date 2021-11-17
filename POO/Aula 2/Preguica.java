
public class Preguica extends Animais {

		private String regiao;
		private String corPelos;
		
		public Preguica(String nome, int idade, String regiao, String corPelos)
		{
			super(nome,idade);
			this.regiao = regiao;
			this.corPelos = corPelos;
		}
		
		@Override
		public void som() 
		{
			 System.out.println("Tuctuctuctuc!");
		}


		@Override
		public void corre(Boolean corre) 
		{
			if (corre == false) 
			{
				System.out.println("Esse animal corre.");
			}
			else
			{
				System.out.println("Esse animal sobe em �rvores.");
			}
		}
		
		public void imprimirInfo()
		{
			System.out.println("\n\t\t\tPregui�a \nNome: "+getNome()+"\nIdade: "+getIdade()+"\nQual a regi�o de origem? "+regiao+"\nQual a cor do pelo? "+corPelos);
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
