package exerciciosjava;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
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
		
		System.out.println("A m�dia ponderada �: " + media);
		
	}

}
