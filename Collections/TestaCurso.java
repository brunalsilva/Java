package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java","Paulo Silveira");

//        List<Aula> aulas = javaColecoes.getAulas();
//        System.out.println(aulas);

//        a partir do momento em que o método getAulas tem um 'unmodifiableList(aulas)', ao tentar adicionar diretamente à lista, recebemos uma exceção
//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
//        System.out.println(javaColecoes.getAulas());

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",22));
        javaColecoes.adiciona(new Aula("Reforço espanhol",40));
        System.out.println(javaColecoes.getAulas());


    }
}
