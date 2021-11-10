package lacorepeticao;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)*/
		
		int idade, cont1=0, cont2=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				cont1++;
			}
			else if (idade>50)
			{
				cont2++;
			}
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("O total de pessoas com menos de 21 anos foi: "+cont1);
		System.out.println("O total de pessoas com mais de 50 anos foi: "+cont2);
		
		
		
	}
}
