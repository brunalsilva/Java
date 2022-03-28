package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        //'set' não tem ordenação específica
        //apenas um objeto único em cada 'set'
        Set<String> alunos = new HashSet<>();
        alunos.add("Bruna Silva");
        alunos.add("Nico Steppat");
        alunos.add("Ana Clara");
        alunos.add("Renan Borges");
        alunos.add("Paulo Alves");

        System.out.println(alunos);

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        boolean brunaMatriculada = alunos.contains("Bruna Silva");
        System.out.println(brunaMatriculada);

        alunos.remove("Paulo Alves");

    }
}
