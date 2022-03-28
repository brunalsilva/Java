package br.com.alura;

public class TestaBuscaAlunos {
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

        System.out.println("Quem é o aluno com matrícula 174520?");
        Aluno aluno = javaColecoes.buscaMatriculado(174520);
        System.out.println("Aluno: " + aluno);

    }
}
