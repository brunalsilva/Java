package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploCursos {
    public static void main(String[] args) {
        List<Cursos> cursos = new ArrayList<>();
        cursos.add(new Cursos("Node JS", 100));
        cursos.add(new Cursos("Spring", 68));
        cursos.add(new Cursos("Java", 42));
        cursos.add(new Cursos("Ruby on Rails", 53));

        cursos.sort(Comparator.comparing(Cursos::getAlunos));

        //dessa forma, imprime o 'toString'
        //cursos.forEach(System.out::println);

        cursos.forEach(c -> System.out.println(c.getNome()));

        //tudo que é feito num stream NÃO impacta a lista original
        cursos.stream()
                .filter(c -> c.getAlunos() >= 60)
                .forEach(c -> System.out.println(c.getNome() + " " + c.getAlunos()));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 60)
                .map(Cursos::getAlunos)
                .forEach(System.out::println);

        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 60)
                .mapToInt(Cursos::getAlunos)
                .sum();
        System.out.println(sum);

        cursos.stream()
                .filter(c -> c.getNome().contains("J"))
                .forEach(c -> System.out.println(c.getNome()));

        Optional<Cursos> optionalCursos = cursos.stream()
                .filter(c -> c.getAlunos() >= 60)
                .findAny();

//        dessa forma, pode ocorrer uma exceção
//        Cursos curso = optionalCursos.orElse(null);
//        System.out.println("------------\n" + curso.getNome());

//      com o método 'ifPresent' a exceção é evitada, mesmo que um objeto não seja encontrado
        optionalCursos.ifPresent(c -> System.out.println(c.getNome()));

        List<Cursos> cursosF = cursos.stream()
                .filter(c -> c.getNome().contains("J"))
                .collect(Collectors.toList());
        System.out.println(cursosF);

    }
}

