package lacorepeticao;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		
		int n, soma=0;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		do
		{
			if(n!=0)
			{
				soma+=n;
				
				System.out.println("Digite um número: ");
				n = leia.nextInt();
			}
		} while(n!=0);
		
		System.out.println("A soma dos números digitados é: "+soma);
	}

}
