package Aula2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.*;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class ExerciseInClass2 {

    public static void main(String[] args) {
        /*
    1. Dado uma data e hora específica,
    use a nova API de data do Java para criar um objeto
    ZonedDateTime com o seu fuso horário e imprimí-los;
    */
        System.out.println("\nExercicio 1:\n");
        ZonedDateTime dataHoraZonaEspecifica = ZonedDateTime.of(2022, 12, 24, 12, 30, 59, 0, ZoneId.of("America/Sao_Paulo"));
        System.out.println(dataHoraZonaEspecifica);
        System.out.println();

        /*
    2. A partir da data atual, calcule e imprima uma compra de R$ 64.000,00
    parcelado em 48x, imprima o valor e a data de cada parcela usando a nova API de datas do Java.
    Obs.: com uma nova regra;
    Caso a data do pagamento seja no final de semana, a data do pagamento deve ser postergada para
    a primeira segunda feira subsequente, porém sem alterar a data dos próximos pagamentos!
    */
        System.out.println("\nExercicio 2:\n");
        LocalDateTime localDateTimeAtual = LocalDateTime.now();
        BigDecimal valorCompra = BigDecimal.valueOf(64000);
        BigDecimal parcelas = BigDecimal.valueOf(48);
        for (int i = 0; i < parcelas.intValueExact(); i++) {
            LocalDateTime localDateTimePagamento = localDateTimeAtual.plusMonths(i);
            DayOfWeek dayOfWeek = localDateTimePagamento.getDayOfWeek();
            if (dayOfWeek == SATURDAY) {
                localDateTimePagamento = localDateTimePagamento.plusDays(2);
            }
            if (dayOfWeek == SUNDAY) {
                localDateTimePagamento = localDateTimePagamento.plusDays(1);
            }
            System.out.printf("O valor da parcela %s é: R$%s.\n" + "A data do pagamento é: %s - %s\n", (i + 1), (valorCompra.divide(parcelas, RoundingMode.UP)), localDateTimePagamento, localDateTimePagamento.getDayOfWeek());
        }

        /*
    3. A partir da sua data de nascimento, faça um programa que calcule as seguintes informações;
    a) Qual dia da semana era;
    b) Qual foi o dia da semana do primeiro dia daquele mês;
    c) Qual foi o dia da semana do primeiro dia daquele ano;
    d) Qual foi o dia da semana do último dia daquele mês;
    e) Qual foi o dia da semana do último dia daquele ano;
    f) Qual foi o dia da primeira sexta feira após aquela data;
    */
        System.out.println("\nExercicio 3:\n");
        LocalDate meuAniversario = LocalDate.of(1994, 8, 17);

        System.out.println("a) " + meuAniversario.getDayOfWeek());
        System.out.println("b) " + meuAniversario.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());
        System.out.println("c) " + meuAniversario.with(TemporalAdjusters.firstDayOfYear()).getDayOfWeek());
        System.out.println("d) " + meuAniversario.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());
        System.out.println("e) " + meuAniversario.with(TemporalAdjusters.lastDayOfYear()).getDayOfWeek());
        System.out.println("f) " + meuAniversario.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));


    }

}
