package array;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		- Os n�meros pares digitados;  
		- A soma dos n�meros pares digitados; 
		- Os n�meros �mpares digitados; 
		- A quantidade de n�meros �mpares digitados.*/
		
		Scanner leia = new Scanner(System.in);
		
		int[] n = new int[6];
		
		int x, somaPar=0, somaImpar=0, contPar=0, contImpar=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("Digite um n�mero: ");
			n[x] = leia.nextInt();
			
		}
		
		System.out.println("Valores pares digitados: ");
		for(x=0;x<6;x++)
		{
			if(n[x]%2==0)
			{
				System.out.println(n[x]);
				somaPar+=n[x];
			}
		}
		
		System.out.println("A soma dos n�meros pares foi: "+somaPar);
		System.out.println("Valores �mpares digitados: ");
		for(x=0;x<6;x++)
		{
			if(n[x]%2==1)
			{
				System.out.println(n[x]);
				somaImpar+=n[x];
			}
		}
		System.out.println("A soma dos n�meros �mpar foi: "+somaImpar);
	}

}
