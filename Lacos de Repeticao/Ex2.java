package lacorepeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		
		Scanner leia = new Scanner(System.in);
		
		int x=0, num, contPar=0, contImpar=0;
		
		for(x=0;x<10;x++)
		{
			System.out.println("Digite um número: ");
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
		
		System.out.println("Foi digitado "+contPar+" números pares e "+contImpar+" números ímpares.");

	}

}
