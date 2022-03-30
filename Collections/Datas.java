package br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate aniversario = LocalDate.of(2023, Month.FEBRUARY, 21);
        int anos = aniversario.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, aniversario);
        System.out.println(periodo.getDays());

        //o localdate é imutável, portanto as mudanças devem ser armazenadas em uma variável local
        LocalDate aniversarioMaisQuatro = aniversario.plusYears(4);
        System.out.println(aniversarioMaisQuatro);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String aniversarioMaisQuatroFormat = aniversarioMaisQuatro.format(formatter);
        System.out.println(aniversarioMaisQuatroFormat);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        DateTimeFormatter formatterHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(agora.format(formatterHoras));
    }
}
