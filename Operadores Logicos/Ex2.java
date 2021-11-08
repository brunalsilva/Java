package exerciciosjava;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a sua idade somente em dias: ");
		int totalDias = leia.nextInt();
		
		int anos = totalDias/365;
		int meses = (totalDias%365)/30;
		int dias = (totalDias%30)%30;
		
		System.out.println("A sua idade é: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

	}

}
