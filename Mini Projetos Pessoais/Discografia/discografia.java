package pooaula1;

public class discografia {
		
		private String album;
		private String faixas;
		private int ano;
		private int metacritic;
		
		public discografia (String album, String faixas, int ano, int metacritic)
		{
			this.setAlbum(album);
			this.setFaixas(faixas);
			this.setAno(ano);
			this.setMetacritic(metacritic);
		}

		public void imprimir()
		{
			System.out.println("\n"+album+" - ("+ano+")"+"\nMetacritic Score: "+metacritic+"\n"+faixas);
		}

		public String getAlbum() {
			return album;
		}

		public void setAlbum(String album) {
			this.album = album;
		}

		public String getFaixas() {
			return faixas;
		}

		public void setFaixas(String faixas) {
			this.faixas = faixas;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public double getMetacritic() {
			return metacritic;
		}

		public void setMetacritic(int metacritic) {
			this.metacritic = metacritic;
		}
		
		
}
