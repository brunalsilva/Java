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
		
		System.out.println("\nEscolha uma op��o: \n1-Alterar tipo do avi�o \n2-Alterar modelo do avi�o \n3-Alterar cia a�rea \n4-Alterar ano de fabrica��o \n5-Sair");
		op = leia.nextInt();
		
		while (op!=5)
		{
			if (op==1)
			{
				System.out.println("\nQual � o novo tipo do avi�o? ");
				String t = leia.next();
				aviao1.setTipo(t);
			}
			if (op==2)
			{
				System.out.println("\nQual � o novo modelo? ");
				String m = leia.next();
				aviao1.setModelo(m);
			}
			if (op==3)
			{
				System.out.println("\nQual � a nova cia a�rea? ");
				String c = leia.next();
				aviao1.setCiaAerea(c);
			}
			if (op==4)
			{
				System.out.println("\nQual � o ano de fabrica��o? ");
				int a = leia.nextInt();
				aviao1.setAno(a);
			}
			
			System.out.println("\nEscolha uma op��o: \n1-Alterar tipo do avi�o \n2-Alterar modelo do avi�o \n3-Alterar cia a�rea \n4-Alterar ano de fabrica��o \n5-Sair");
			op = leia.nextInt();
		}
		
		System.out.println("\n*Dados atualizados*");
		aviao1.imprimirInfo();
	}

}
