package lacodecisao;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.*/
		
	Scanner leia = new Scanner(System.in);
	
	double x;
	
	System.out.println("Digite um n�mero: ");
	x = leia.nextDouble();
	
	if(x%2==0)
	{
		System.out.println("O n�mero digitado � par. Sua raiz quadrada �: " + Math.sqrt(x));
	}
	else
	{
		System.out.println("O n�mero digitado � �mpar. O n�mero elevado ao quadrado tem o valor: " + Math.pow(x, 2));
	}
	
	}
}
