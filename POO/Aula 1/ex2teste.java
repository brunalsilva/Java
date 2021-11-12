package pooaula1;

import java.util.Scanner;

public class ex2teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("*Dados atuais*");
		ex2aviao aviao1 = new ex2aviao ("Boeing","A554","Swiss",2013);
		aviao1.imprimirInfo();
		
		System.out.println("\nEscolha uma opção: \n1-Alterar tipo do avião \n2-Alterar modelo do avião \n3-Alterar cia aérea \n4-Alterar ano de fabricação \n5-Sair");
		op = leia.nextInt();
		
		while (op!=5)
		{
			if (op==1)
			{
				System.out.println("\nQual é o novo tipo do avião? ");
				String t = leia.next();
				aviao1.setTipo(t);
			}
			if (op==2)
			{
				System.out.println("\nQual é o novo modelo? ");
				String m = leia.next();
				aviao1.setModelo(m);
			}
			if (op==3)
			{
				System.out.println("\nQual é a nova cia aérea? ");
				String c = leia.next();
				aviao1.setCiaAerea(c);
			}
			if (op==4)
			{
				System.out.println("\nQual é o ano de fabricação? ");
				int a = leia.nextInt();
				aviao1.setAno(a);
			}
			
			System.out.println("\nEscolha uma opção: \n1-Alterar tipo do avião \n2-Alterar modelo do avião \n3-Alterar cia aérea \n4-Alterar ano de fabricação \n5-Sair");
			op = leia.nextInt();
		}
		
		System.out.println("\n*Dados atualizados*");
		aviao1.imprimirInfo();
	}

}
