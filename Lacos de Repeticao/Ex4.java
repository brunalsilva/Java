package lacorepeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		- o n�mero de pessoas calmas;
		- o n�mero de mulheres nervosas;
		- o n�mero de homens agressivos;
		- o n�mero de outros calmos;
		- o n�mero de pessoas nervosas com mais de 40 anos;
		- o n�mero de pessoas calmas com menos de 18 anos.*/
		
		Scanner leia = new Scanner(System.in);
		
		int idade,opS,opP,x=0, contCalma=0, contMC=0, contHA=0, contOtC=0, contN40=0, contC18=0;
		
		System.out.println("Qual � a sua idade?");
		idade = leia.nextInt();
		System.out.println("Sexo: \n1-Feminino \n2-Masculino \n3-Outros");
		opS = leia.nextInt();
		System.out.println("Voc� se considera: \n1-Calma(o) \n2-Nervosa(o) \n3-Agressiva(o)");
		opP = leia.nextInt();
		
		while(x<151)
		{
			if(opP==1)
			{
				contCalma++;
			}
			if(opS==1 && opP==1)
			{
				contMC++;
			}
			if(opS==2 && opP==3)
			{
				contHA++;
			}
			if(opS==3 && opP==1)
			{
				contOtC++;
			}
			if(opP==2 && idade>40)
			{
				contN40++;
			}
			if(opP==1 && idade<18)
			{
				contC18++;
			}
			
			x++;
			
			System.out.println("Qual � a sua idade?");
			idade = leia.nextInt();
			System.out.println("Sexo: \n1-Feminino \n2-Masculino \n3-Outros");
			opS = leia.nextInt();
			System.out.println("Voc� se considera: \n1-Calma(o) \n2-Nervosa(o) \n3-Agressiva(o)");
			opP = leia.nextInt();
			
		}
		
		System.out.println("N�mero de pessoas calmas: "+contCalma);
		System.out.println("N�mero de mulheres nervosas: "+contMC);
		System.out.println("N�mero de homens agressivos: "+contHA);
		System.out.println("N�mero de outros calmos: "+contOtC);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: "+contN40);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: "+contC18);
		
	}

}
