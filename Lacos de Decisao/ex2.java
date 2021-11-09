package lacodecisao;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		/*Faça um programa que entre com três números e coloque em ordem crescente.*/
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite um número:");
		a = leia.nextInt();
		System.out.println("Digite um número:");
		b = leia.nextInt();
		System.out.println("Digite um número:");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			if(b>c)
			{
				System.out.println("A ordem crescente dos números é: "+c+" "+b+" "+a);
			}
			else
			{
				System.out.println("A ordem crescente dos números é: "+b+" "+c+" "+a);
			}
		}
		else if (b>a && b>c)
		{
			if(a>c)
			{
				System.out.println("A ordem crescente dos números é: "+c+" "+a+" "+b);
			}
			else
			{
				System.out.println("A ordem crescente dos números é: "+a+" "+c+" "+b);
			}
		}
		else if (c>a && c>b)
		{
			if(b>a)
			{
				System.out.println("A ordem crescente dos números é: "+a+" "+b+" "+c);
			}
			else
			{
				System.out.println("A ordem crescente dos números é: "+b+" "+a+" "+c);
			}
		}
	}
}
