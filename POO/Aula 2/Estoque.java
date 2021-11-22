import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa deverá atender as seguintes funcionalidades:
			Armazenar dados da List
			Remover dados da list;
			Atualizar dados da list.
			Apresentar todos os dados da list.*/
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n1- Deseja adicionar itens ao estoque? \n2- Deseja remover itens do estoque? \n3- Deseja atualizar os itens do estoque? \n4- Deseja mostrar os itens do estoque? \n5 - Encerrar o programa.");
			op = leia.nextInt();
			
			switch (op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do item para adicionar ao estoque:");
				String item = leia.nextLine();
				estoque.add(item);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o nome do item que será removido do estoque:");
				String itemr = leia.nextLine();
				
				if (estoque.contains(itemr))
				{
					estoque.remove(itemr);
				}
				else
				{
					System.out.println("\nItem não encontrado.");
				}
				
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o item que deseja atualizar:");
				String verificador = leia.nextLine();
				System.out.println("\nDigite o item que entrará no lugar do item "+verificador+" .");
				String novo = leia.nextLine();
				
				System.out.println("\n"+estoque);
				
				break;
				
			case 4:
				System.out.println("\nOs itens do estoque são: ");
				System.out.println(estoque);
				break;
				
				default: System.out.println("\nPrograma finalizado.");
			}
			
		} while (op!=5);
		
	}

}
