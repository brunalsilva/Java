package lacodecisao;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite um n�mero:");
		a = leia.nextInt();
		System.out.println("Digite um n�mero:");
		b = leia.nextInt();
		System.out.println("Digite um n�mero:");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			if(b>c)
			{
				System.out.println("A ordem crescente dos n�meros �: "+c+" "+b+" "+a);
			}
			else
			{
				System.out.println("A ordem crescente dos n�meros �: "+b+" "+c+" "+a);
			}
		}
		else if (b>a && b>c)
		{
			if(a>c)
			{
				System.out.println("A ordem crescente dos n�meros �: "+c+" "+a+" "+b);
			}
			else
			{
				System.out.println("A ordem crescente dos n�meros �: "+a+" "+c+" "+b);
			}
		}
		else if (c>a && c>b)
		{
			if(b>a)
			{
				System.out.println("A ordem crescente dos n�meros �: "+a+" "+b+" "+c);
			}
			else
			{
				System.out.println("A ordem crescente dos n�meros �: "+b+" "+a+" "+c);
			}
		}
	}
}
