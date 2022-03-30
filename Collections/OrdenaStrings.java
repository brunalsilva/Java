package br.com.alura.java8;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Saoko");
        palavras.add("Blueeeee");
        palavras.add("Froot");

        Collections.sort(palavras);
        System.out.println(palavras);

        Comparator<String> comparador = new ComparadorPorTamanho();
        //Collections.sort(palavras, comparador);
        palavras.sort(comparador);
        System.out.println(palavras);

//      Implementação com classe anônima
//        Consumer<String> consumidor = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        };

//      Com lambda. Para cada palavra 's', sysout 's'
        palavras.forEach(s -> System.out.println(s));

//      Com method reference
        palavras.forEach(System.out::println);

//      palavras ordene comparando o length da string
        palavras.sort(Comparator.comparingInt(String::length));

    }
}

// Usando default method
//class ImprimeNaLinha implements Consumer<String> {
//
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) return -1;
        if (s1.length() > s2.length()) return 1;
        return 0;
    }
}