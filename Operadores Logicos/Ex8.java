package exerciciosjava;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
		/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.*/
		
		Scanner leia = new Scanner(System.in);
		
		float custoTotal, custoFab, pDis, ind;
		
		System.out.println("Qual é o custo de fábrica do veículo? ");
		custoFab = leia.nextFloat();
		
		pDis = (28*custoFab/100);
		ind = (45*custoFab/100);

		custoTotal = (custoFab + pDis) + ind;
		
		System.out.println("O custo total é: " + custoTotal);
	}

}
