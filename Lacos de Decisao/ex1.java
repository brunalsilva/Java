package lacodecisao;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
		
		Scanner leia = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.println("Digite um n�mero: ");
		x = leia.nextInt();
		System.out.println("Digite um n�mero: ");
		y = leia.nextInt();
		System.out.println("Digite um n�mero: ");
		z = leia.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println("O maior n�mero �: " + x);
		}
		else if(y>x && y>z)
		{
			System.out.println("O maior n�mero �: " + y);
		}
		else
		{
			System.out.println("O maior n�mero �: " + z);
		}
		
	}
}
