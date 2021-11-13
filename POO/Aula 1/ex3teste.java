package pooaula1;

import java.util.Scanner;

public class ex3teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int op;
		
		System.out.println("Qual é o tipo do produto? ");
		String tipo = leia.next();
		
		System.out.println("Qual é a marca? ");
		String marca = leia.next();
		
		System.out.println("Qual é a cor do produto? ");
		String cor = leia.next();
		
		System.out.println("Qual é o ano de fabricação? ");
		int ano = leia.nextInt();
		
		ex3elet produto1 = new ex3elet (tipo,marca,cor,ano);
		produto1.imprimirDados();
		System.out.println("\nDeseja alterar os dados do produto? \n1-Sim \n2-Não");
		op = leia.nextInt();
		
		if(op==1)
		{
			System.out.println("\n1-Alterar o tipo de produto \n2-Alterar a marca \n3-Alterar a cor do produto \n4-Alterar o ano de fabricação \n5-Sair");
			op = leia.nextInt();
			
			do
			{
				if(op==1)
				{
					System.out.println("\nQual o tipo do produto?");
					tipo = leia.next();
					produto1.setTipo(tipo);
				}
				if(op==2)
				{
					System.out.println("\nQual a marca?");
					marca = leia.next();
					produto1.setMarca(marca);
				}
				if(op==3)
				{
					System.out.println("\nQual a cor do produto?");
					cor = leia.next();
					produto1.setCor(cor);
				}
				if(op==4)
				{
					System.out.println("\nQual o ano de fabricação do produto?");
					ano = leia.nextInt();
					produto1.setAno(ano);
				}
				
				System.out.println("\n1-Alterar o tipo de produto \n2-Alterar a marca \n3-Alterar a cor do produto \n4-Alterar o ano de fabricação \n5-Sair");
				op = leia.nextInt();
			}
			
			while(op!=5);		
			
			produto1.imprimirDados();
		}
		else
		{
			produto1.imprimirDados();
		}
		
	}

}
