package lacorepeticao;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		
		int n, soma=0;
		
		System.out.println("Digite um n�mero: ");
		n = leia.nextInt();
		
		do
		{
			if(n!=0)
			{
				soma+=n;
				
				System.out.println("Digite um n�mero: ");
				n = leia.nextInt();
			}
		} while(n!=0);
		
		System.out.println("A soma dos n�meros digitados �: "+soma);
	}

}
