package pooaula1;

import java.util.Scanner;

public class discografiaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		
		String artista1 = "Marina";
		String artista2 = "Lorde";
		String artista3 = "Bjork";
		
		int op;
		
		System.out.println("Escolha um artista: \n1- "+artista1+"\n2- "+artista2+"\n3- "+artista3+"\n4- Sair");
		op = leia.nextInt();
		
		while(op!=4)
		{
			if(op==1)
			{	
				discografia [] marina = new discografia[5];
				marina [0] = new discografia("The Family Jewels","13 faixas",2010,68);
				marina [1] = new discografia("Electra Heart","13 faixas",2012,57);
				marina [2] = new discografia("Froot","12 faixas",2015,75);
				marina [3] = new discografia("Love+Fear","16 faixas",2019,62);
				marina [4] = new discografia("Ancient Dreams in a Modern Land","10 faixas",2021,77);
				
				for(x=0;x<5;x++)
				{
					marina[x].imprimir();
				}
			}
			if (op==2)
			{
				discografia [] lorde = new discografia[3];
				lorde [0] = new discografia("Pure Heroine","10 faixas",2013,79);
				lorde [1] = new discografia("Melodrama","11 faixas",2017,91);
				lorde [2] = new discografia("Solar Power","12 faixas",2021,69);
				
				for(x=0;x<3;x++)
				{
					lorde[x].imprimir();
				}
			}
			if (op==3)
			{
				discografia [] bjork = new discografia[9];
				bjork [0] = new discografia("Debut","11 faixas",1993,68);
				bjork [1] = new discografia("Post","11 faixas",1995,79);
				bjork [2] = new discografia("Homogenic","10 faixas",1997,83);
				bjork [3] = new discografia("Vespertine","12 faixas",2001,88);
				bjork [4] = new discografia("Medulla","14 faixas",2004,84);
				bjork [5] = new discografia("Volta","10 faixas",2007,77);
				bjork [6] = new discografia("Biophilia","10 faixas",2011,79);
				bjork [7] = new discografia("Vulnicura","9 faixas",2015,87);
				bjork [8] = new discografia("Utopia","14 faixas",2017,82);
				
				for(x=0;x<9;x++)
				{
					bjork[x].imprimir();
				}
			}
			
			System.out.println("\nEscolha um artista: \n1- "+artista1+"\n2- "+artista2+"\n3- "+artista3+"\n4- Sair");
			op = leia.nextInt();
			
		}
		
		System.out.println("\nVamos jogar?");
		
		int acertos=0;
		int erros=0;
		
		do
		{
			System.out.println("\n(1) Qual o nome do segundo álbum da Lorde? \n1- Pure Heroine \n2- Utopia \n3- Melodrama \n4- Sair");
			op = leia.nextInt();
			
			if (op==3)
			{
				System.out.println("\nAcertou!!! Vamos para a próxima pergunta...");
				acertos++;
			} 
			else
			{
				System.out.println("\nResposta errada :( Vamos para a próxima pergunta...");
				erros++;
			}
			
			System.out.println("\n(2) Quantas faixas tem o álbum Homogenic da Bjork? \n1- 9 faixas \n2- 10 faixas \n3- 11 faixas \n4- Sair");
			op = leia.nextInt();
			
			if (op==2)
			{
				System.out.println("\nAcertou!!! Vamos para a próxima pergunta...");
				acertos++;
			}
			else
			{
				System.out.println("\nResposta errada :( Vamos para a próxima pergunta...");
				erros++;
			}
			
			System.out.println("\n(3) Qual é o álbum da Marina mais bem avaliado no Metacritic? \n1- Electra Heart \n2- Froot \n3- Ancient Dreams in a Modern Land \n4- Sair");
			op = leia.nextInt();
			
			if (op==3)
			{
				System.out.println("\nAcertou!!! Vamos para a próxima pergunta...");
				acertos++;
			}
			else
			{
				System.out.println("\nResposta errada :( Vamos para a próxima pergunta...");
				erros++;
			}
			
			System.out.println("\n(4) Qual o nome do segundo álbum da Bjork? \n1- Post \n2- Vespertine \n3- Volta \n4- Sair");
			op = leia.nextInt();
			
			if (op==1)
			{
				System.out.println("\nAcertou!!! Vamos para a próxima pergunta...");
				acertos++;
			}
			else
			{
				System.out.println("\nResposta errada :( Vamos para a próxima pergunta...");
				erros++;
			}
			
			System.out.println("\n(5) Qual o ano de lançamento do álbum Pure Heroine da Lorde? \n1- 2012 \n2- 2013 \n3- 2014 \n4- Sair");
			op = leia.nextInt();
			
			if (op==2)
			{
				System.out.println("\nAcertou!!! Vamos para a próxima pergunta...");
				acertos++;
			}
			else
			{
				System.out.println("\nResposta errada :( Vamos para a próxima pergunta...");
				erros++;
			}
			
			System.out.println("\n(6) Qual nome do primeiro álbum da Marina? \n1- Froot \n2- Love+Fear \n3- The Family Jewels \n4- Sair");
			op = leia.nextInt();
			
			if (op==3)
			{
				System.out.println("\nAcertou!!! Vamos para a próxima pergunta...");
				acertos++;
			}
			else
			{
				System.out.println("\nResposta errada :( Vamos para a próxima pergunta...");
				erros++;
			}
			
			System.out.println("\n(7) Qual o ano de lançamento do álbum Love+Fear da Marina? \n1- 2019 \n2- 2020 \n3- 2021 \n4- Sair");
			op = leia.nextInt();
			
			if (op==1)
			{
				System.out.println("\nAcertou!!! Vamos para a próxima pergunta...");
				acertos++;
			}
			else
			{
				System.out.println("\nResposta errada :( Vamos para a próxima pergunta...");
				erros++;
			}
			
			System.out.println("\n(8) Quantos álbuns de estúdio a Lorde tem? \n1- 4 \n2- 3 \n3- 2 \n4- Sair");
			op = leia.nextInt();
			
			if (op==2)
			{
				System.out.println("\nAcertou!!! Vamos para a próxima pergunta...");
				acertos++;
			}
			else
			{
				System.out.println("\nResposta errada :( Vamos para a próxima pergunta...");
				erros++;
			}
			
			System.out.println("\n(9) Qual o ano de lançamento do álbum Biophilia da Bjork? \n1- 2009 \n2- 2010 \n3- 2011 \n4- Sair");
			op = leia.nextInt();
			
			if (op==3)
			{
				System.out.println("\nAcertou!!! Vamos para a próxima pergunta...");
				acertos++;
			}
			else
			{
				System.out.println("\nResposta errada :( Vamos para a próxima pergunta...");
				erros++;
			}
			
			System.out.println("\n(10) Quantas faixas tem o álbum Solar Power da Lorde? \n1- 12 faixas \n2- 13 faixas \n3- 14 faixas \n4- Sair");
			op = leia.nextInt();
			
			if (op==1)
			{
				System.out.println("\nAcertou!!! Vamos aos resultados finais...");
				acertos++;
			}
			else
			{
				System.out.println("\nResposta errada :( Vamos aos resultados finais...");
				erros++;
			}
			
		} while(acertos+erros!=10 && op!=4);
		
		System.out.println("\nJogo finalizado! Você acertou "+acertos+" perguntas e errou "+erros+".");
	}

}
