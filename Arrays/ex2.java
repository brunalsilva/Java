package array;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Faça um programa que receba 6 números inteiros e mostre: 
		- Os números pares digitados;  
		- A soma dos números pares digitados; 
		- Os números ímpares digitados; 
		- A quantidade de números ímpares digitados.*/
		
		Scanner leia = new Scanner(System.in);
		
		int[] n = new int[6];
		
		int x, somaPar=0, somaImpar=0, contPar=0, contImpar=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("Digite um número: ");
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
		
		System.out.println("A soma dos números pares foi: "+somaPar);
		System.out.println("Valores ímpares digitados: ");
		for(x=0;x<6;x++)
		{
			if(n[x]%2==1)
			{
				System.out.println(n[x]);
				somaImpar+=n[x];
			}
		}
		System.out.println("A soma dos números ímpar foi: "+somaImpar);
	}

}
