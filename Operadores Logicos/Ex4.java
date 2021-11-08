package exerciciosjava;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Dê um valor para A: ");
		int A = leia.nextInt();
		
		System.out.println("Dê um valor para B: ");
		int B = leia.nextInt();
		
		System.out.println("Dê um valor para C: ");
		int C = leia.nextInt();
		
		double R = Math.pow((A+B), 2);
		double S = Math.pow((B+C), 2);
		double D = (R+S)/2;
		
		System.out.println("O valor de R é: " + R + ", o valor de S é: " + S + " e o valor de D é: " + D);
	}
}
