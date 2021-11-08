package exerciciosjava;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade em anos: ");
		int anos = leia.nextInt();
		
		System.out.println("Entre com a sua idade em meses: ");
		int meses = leia.nextInt();
		
		System.out.println("Entre com a sua idade em dias: ");
		int dias = leia.nextInt();
		
		int totalDias = (anos*360) + (meses*30) + dias;
		
		System.out.println("O total de dias é " + totalDias);
	}

}
