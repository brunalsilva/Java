package exerciciosjava;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float x1, x2, y1, y2;
		double d;
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextFloat();
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextFloat();
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextFloat();
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextFloat();
		
		d = Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
		
		System.out.println("O valor de d �: " + d);
	}
}
