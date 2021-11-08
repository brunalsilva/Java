package exerciciosjava;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		float nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o valor da primeira nota? ");
		nota1 = leia.nextFloat();
		System.out.println("Qual o valor da segunda nota? ");
		nota2 = leia.nextFloat();
		System.out.println("Qual o valor da terceira nota? ");
		nota3 = leia.nextFloat();
		
		media = (nota1*2) + (nota2*3) + (nota3*5) / 10;
		
		System.out.println("A média ponderada é: " + media);
		
	}

}
