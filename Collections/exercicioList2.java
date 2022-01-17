package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exercicioList2 {

	/*
	 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
	 * sobre um crime. As perguntas são: 1. "Telefonou para a vítima?" 2.
	 * "Esteve no local do crime?" 3. "Mora perto da vítima?" 4.
	 * "Devia para a vítima?" 5. "Já trabalhou com a vítima?" 
	 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3
	 * e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ele será
	 * classificado como "Inocente".
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> respostas = new ArrayList<>(4);

		Scanner scan = new Scanner(System.in);

		int x = 0;

		System.out.println("Atenção: responda apenas com S ou N.");

		String resp;
		String sim = "S";
		String não = "N";

		while (x < 5) {

			System.out.println("\n1. Telefonou para a vítima? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(não)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inválida. \n1. Telefonou para a vítima? ");
				resp = scan.nextLine();
				respostas.add(resp);
				x++;
			}

			System.out.println("\n2. Esteve no local do crime? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(não)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inválida. \n2. Esteve no local do crime? ");
				resp = scan.nextLine();
				respostas.add(resp);
				x++;
			}

			System.out.println("\n3. Mora perto da vítima? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(não)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inválida. \n3. Mora perto da vítima? ");
				resp = scan.nextLine();
				respostas.add(resp);
				x++;
			}

			System.out.println("\n4. Devia para a vítima? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(não)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inválida. \n4. Devia para a vítima? ");
				resp = scan.nextLine();
				respostas.add(resp);
				x++;
			}

			System.out.println("\n5. Já trabalhou com a vítima? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(não)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inválida. \n5. Já trabalhou com a vítima? ");
				resp = scan.nextLine();
				respostas.add(resp);
				x++;
			}
		}
		
		int count =0;
		Iterator<String> iterator = respostas.iterator();
		while(iterator.hasNext()) {
			String res = iterator.next();
			if (res.contains("S")) {
				count++;
			}
		}
		
		switch(count) {
        case 2:
            System.out.println(">> SUSPEITA <<"); break;
        case 3:
        case 4:
            System.out.println(">> CÚMPLICE <<"); break;
        case 5:
            System.out.println(">> ASSASSINO <<"); break;
        default:
            System.out.println(">> INOCENTE <<"); break;
    }
		
	}

}
