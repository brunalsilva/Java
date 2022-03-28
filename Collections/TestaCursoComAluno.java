package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java","Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",22));
        javaColecoes.adiciona(new Aula("Reforço espanhol",40));

        Aluno a1 = new Aluno("Bruna Silva", 210245);
        Aluno a2 = new Aluno("Ana Clara", 415782);
        Aluno a3 = new Aluno("Paulo Silveira", 842145);
        Aluno a4 = new Aluno("Marina Diamandis", 174520);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println("Alunos matriculados: ");
        javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println(javaColecoes.estaMatriculado(a1));

        //se o nome vem de um form da web, por exemplo, viria em String
        String nome = "Bruna Silva";
        //System.out.println(javaColecoes.estaMatriculado(nome));
        //não compila, pois o método se refere a classe Aluno

        Aluno bruna = new Aluno("Bruna Silva", 210245);
        System.out.println(javaColecoes.estaMatriculado(bruna));
        //false, pois os objetos são diferentes. internamento o método 'estaMatriculado' utiliza o 'equals'
        //para definirmos nosso critério de igualdade, devemos sobrescrever o equals na classe Aluno

        System.out.println(a1.equals(bruna));
        //true, pois agora definimos nossa própria regra do equals na classe Aluno e também o HashCode
        //se dois objetos são iguais, eles DEVEM ter o mesmo HashCode
        System.out.println(a1.hashCode() == bruna.hashCode());

        Set<Aluno> alunos = javaColecoes.getAlunos();
//        while (iterator.hasNext()) {
//            Aluno proximo = iterator.next();
//            System.out.println(proximo);
//        }

//      laço while equivalente a:
        for (Aluno proximo : alunos) {
            System.out.println(proximo);
        }

        

    }
}
