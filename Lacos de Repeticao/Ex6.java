package lacorepeticao;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		/*Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		
		int n, cont1=0, total3=0, cont2=0, media;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		do
		{
			if(n%3==0)
			{
				total3+=n;
				cont1++;
			}
			
			cont2++;
			
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			
		} while(n!=0);
		
		media=total3/cont1;
		
		System.out.println("A média dos números múltiplos de 3 é: "+media);
	}
}
