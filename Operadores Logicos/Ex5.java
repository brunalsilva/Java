package exerciciosjava;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
		respectivamente.*/
		
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
