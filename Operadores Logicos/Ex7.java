package exerciciosjava;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c,d,e,f,x,y;
		
		System.out.println("Insira o valor de a: ");
		a = leia.nextInt();
		System.out.println("Insira o valor de b: ");
		b = leia.nextInt();
		System.out.println("Insira o valor de c: ");
		c = leia.nextInt();
		System.out.println("Insira o valor de d: ");
		d = leia.nextInt();
		System.out.println("Insira o valor de e: ");
		e = leia.nextInt();
		System.out.println("Insira o valor de f: ");
		f = leia.nextInt();
		
		x=(c*e)-(b*f)/(a*e)-(b*d);
		y=(a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.println("O valor de x é: " + x + " e o valor de y é: " + y);
	}

}
