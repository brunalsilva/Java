package exerciciosjava;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o tempo do evento somente em segundos? ");
		int tempoSegundosT = leia.nextInt();
		
		int tempoHoras = tempoSegundosT/3600;
		int tempoMinutos = (tempoSegundosT%3600)/60;
		int tempoSegundos = (tempoSegundosT%3600)%60;
		
		System.out.println("O tempo do evento � de " + tempoHoras + " horas, " + tempoMinutos + " minutos e " + tempoSegundos + " segundos.");

	}

}
