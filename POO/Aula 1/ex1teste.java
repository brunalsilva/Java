package pooaula1;

public class ex1teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex1clientes cliente1 = new ex1clientes("Bruna","Lima","desenvolvedora",24);
		cliente1.imprimirDados();
		
		System.out.println("\n*Mudan�a de sobrenome*");
		cliente1.setSobrenomeCliente("Silva");
		cliente1.imprimirDados();
		
		ex1clientes cliente2 = new ex1clientes("Valdir","Cardoso","funcion�rio p�blico",49);
		cliente2.imprimirDados();
		
		System.out.println("\n*Mudan�a de profiss�o*");
		cliente2.setProfissao("aposentado");
		cliente2.imprimirDados();
	}

}
