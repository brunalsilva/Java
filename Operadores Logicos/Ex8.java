package exerciciosjava;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
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
