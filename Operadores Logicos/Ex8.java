package exerciciosjava;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
		/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		consumidor.*/
		
		Scanner leia = new Scanner(System.in);
		
		float custoTotal, custoFab, pDis, ind;
		
		System.out.println("Qual � o custo de f�brica do ve�culo? ");
		custoFab = leia.nextFloat();
		
		pDis = (28*custoFab/100);
		ind = (45*custoFab/100);

		custoTotal = (custoFab + pDis) + ind;
		
		System.out.println("O custo total �: " + custoTotal);
	}

}
