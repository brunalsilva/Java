package br.com.alura.java8;

public class Cursos {
    private String nome;
    private int alunos;

    public Cursos(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

