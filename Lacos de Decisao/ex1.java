package lacodecisao;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		Scanner leia = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.println("Digite um número: ");
		x = leia.nextInt();
		System.out.println("Digite um número: ");
		y = leia.nextInt();
		System.out.println("Digite um número: ");
		z = leia.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println("O maior número é: " + x);
		}
		else if(y>x && y>z)
		{
			System.out.println("O maior número é: " + y);
		}
		else
		{
			System.out.println("O maior número é: " + z);
		}
		
	}
}
