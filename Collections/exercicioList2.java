package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exercicioList2 {

	/*
	 * Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma pessoa
	 * sobre um crime. As perguntas s�o: 1. "Telefonou para a v�tima?" 2.
	 * "Esteve no local do crime?" 3. "Mora perto da v�tima?" 4.
	 * "Devia para a v�tima?" 5. "J� trabalhou com a v�tima?" 
	 * Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", entre 3
	 * e 4 como "C�mplice" e 5 como "Assassina". Caso contr�rio, ele ser�
	 * classificado como "Inocente".
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> respostas = new ArrayList<>(4);

		Scanner scan = new Scanner(System.in);

		int x = 0;

		System.out.println("Aten��o: responda apenas com S ou N.");

		String resp;
		String sim = "S";
		String n�o = "N";

		while (x < 5) {

			System.out.println("\n1. Telefonou para a v�tima? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(n�o)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inv�lida. \n1. Telefonou para a v�tima? ");
				resp = scan.nextLine();
				respostas.add(resp);
				x++;
			}

			System.out.println("\n2. Esteve no local do crime? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(n�o)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inv�lida. \n2. Esteve no local do crime? ");
				resp = scan.nextLine();
				respostas.add(resp);
				x++;
			}

			System.out.println("\n3. Mora perto da v�tima? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(n�o)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inv�lida. \n3. Mora perto da v�tima? ");
				resp = scan.nextLine();
				respostas.add(resp);
				x++;
			}

			System.out.println("\n4. Devia para a v�tima? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(n�o)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inv�lida. \n4. Devia para a v�tima? ");
				resp = scan.nextLine();
				respostas.add(resp);
				x++;
			}

			System.out.println("\n5. J� trabalhou com a v�tima? ");
			resp = scan.nextLine();
			if (resp.equals(sim) || resp.equals(n�o)) {
				respostas.add(resp);
				x++;
			} else {
				System.out.println("\nResposta inv�lida. \n5. J� trabalhou com a v�tima? ");
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
            System.out.println(">> C�MPLICE <<"); break;
        case 5:
            System.out.println(">> ASSASSINO <<"); break;
        default:
            System.out.println(">> INOCENTE <<"); break;
    }
		
	}

}
