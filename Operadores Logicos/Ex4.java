package exerciciosjava;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		calcule a seguinte express�o: D=(R+S)/2, onde�R=(A+B)� e S=(B+C)� */
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("D� um valor para A: ");
		int A = leia.nextInt();
		
		System.out.println("D� um valor para B: ");
		int B = leia.nextInt();
		
		System.out.println("D� um valor para C: ");
		int C = leia.nextInt();
		
		double R = Math.pow((A+B), 2);
		double S = Math.pow((B+C), 2);
		double D = (R+S)/2;
		
		System.out.println("O valor de R �: " + R + ", o valor de S �: " + S + " e o valor de D �: " + D);
	}
}
