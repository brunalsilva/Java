package array;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		Scanner leia = new Scanner(System.in);
		
		int [][] M = new int [3][3];
		int l,c,cont=0;
		
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.println("Digite um número: ");
				M[l][c]= leia.nextInt();
			}
		}
		
		System.out.println("Valores da matriz maior que 10: ");
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				if(M[l][c]>10)
				{
					System.out.println(M[l][c]);
					cont++;
				}
			}
		}
		System.out.println("No total, foram "+cont+" valores maiores que 10.");
	}

}
