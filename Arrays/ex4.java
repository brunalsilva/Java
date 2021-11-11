package array;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		/*Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de 		op��es:
			(1) somar as duas matrizes 
			(2) subtrair a primeira matriz da segunda 
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes 
		Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da 		constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.*/
		
		Scanner leia = new Scanner(System.in);
		
		double [][] A = new double [2][2];
		double [][] B = new double [2][2];
		double [][] C = new double [2][2];
		int l,c,op,n;
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("Digite um n�mero: ");
				A[l][c]= leia.nextInt();
			}
		}
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("Digite um n�mero: ");
				B[l][c]= leia.nextInt();
			}
		}
		
		System.out.println("Escolha uma op��o: \n1-Somar as duas matrizes \n2-Subtrair a primeira matriz da segunda \n3-Adicionar uma constante �s duas matrizes \n4-Imprimir as matrizes");
		op = leia.nextInt();
		
		if(op==1)
		{
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					C[l][c]=A[l][c]+B[l][c];
				}
			}
			
			System.out.println("\n Matriz C: ");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.printf(" %.2f",C[l][c]," \n ");
                }
				System.out.println();
			}
		}
	
		if(op==2)
		{
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					C[l][c]=A[l][c]-B[l][c];
				}
			}
			System.out.println("\n Matriz C: ");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.printf(" %.2f",C[l][c]," \n ");
                }
				System.out.println();
			}
		}
		
		if(op==3)
		{
			System.out.println("Digite o valor da constante: ");
			n = leia.nextInt();
			
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					A[l][c]+=n;
					B[l][c]+=n;
				}
			}
			
			System.out.println("\n Matriz A: ");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.printf(" %.2f",A[l][c]," \n ");
                }
				System.out.println();
			}
			System.out.println("\n Matriz B: ");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.printf(" %.2f",B[l][c]," \n ");
				}
				System.out.println();
			}
		}
			
		if(op==4)
		{
			System.out.println("\n Matriz A: ");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.printf(" %.2f",A[l][c]," \n ");
                }
				System.out.println();
			}
			System.out.println("\n Matriz B: ");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.printf(" %.2f",B[l][c]," \n ");
				}
				System.out.println();
			}
		}

	}

}
