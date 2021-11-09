package lacodecisao;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/
		
	Scanner leia = new Scanner(System.in);
	
	double x;
	
	System.out.println("Digite um número: ");
	x = leia.nextDouble();
	
	if(x%2==0)
	{
		System.out.println("O número digitado é par. Sua raiz quadrada é: " + Math.sqrt(x));
	}
	else
	{
		System.out.println("O número digitado é ímpar. O número elevado ao quadrado tem o valor: " + Math.pow(x, 2));
	}
	
	}
}
