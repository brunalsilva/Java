package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exercicioList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Double> tempSemestral = new ArrayList<Double>(5);

		Scanner scan = new Scanner(System.in);

		double soma = 0;

		for (int x = 0; x < 6; x++) {
			int y = x + 1;
			System.out.println("Qual foi a temperatura do mês " + y);
			double temp = scan.nextDouble();
			tempSemestral.add(x, temp);
			soma += temp;
		}

		System.out.println("Temperaturas semestrais: ");
		System.out.println(tempSemestral);

		double media = soma / tempSemestral.size();
		System.out.println("Média da temperatura semestral: " + media);

		System.out.println("Meses com temperatura acima da média: ");

		Iterator<Double> iterator = tempSemestral.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			Double temp = iterator.next();
			if (temp > media) {
				switch (count) {
				case (0):
					System.out.printf("1 - janeiro: %.1f\n ", temp);
					break;
				case (1):
					System.out.printf("2 - fevereiro: %.1f\n", temp);
					break;
				case (2):
					System.out.printf("3 - março: %.1f\n", temp);
					break;
				case (3):
					System.out.printf("4 - abril: %.1f\n", temp);
					break;
				case (4):
					System.out.printf("5 - maio: %.1f\n", temp);
					break;
				case (5):
					System.out.printf("6 - junho: %.1f\n", temp);
					break;
				default:
					System.out.println("Não houve temperatura acima da média.");
				}
			}
			count++;
		}

		/*
		 * Iterator<Double> iterator = tempSemestral.iterator(); while
		 * (iterator.hasNext()) { Double next = iterator.next(); if (next > media) {
		 * System.out.println(next); } }
		 */
	}

}
