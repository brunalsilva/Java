package lacorepeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
		
		Scanner leia = new Scanner(System.in);
		
		int x=0, num, contPar=0, contImpar=0;
		
		for(x=0;x<10;x++)
		{
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			if(num%2==0)
			{
				contPar++;
			}
			else
			{
				contImpar++;
			}
		}
		
		System.out.println("Foi digitado "+contPar+" n�meros pares e "+contImpar+" n�meros �mpares.");

	}

}
