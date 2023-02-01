package Aula1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExerciseInClass {
    public static void main(String[] args) {
        /*
        1. Dada uma hora e data específica, use a API de data do Java para criar um objeto
        LocalTime, LocalDate e LocalDateTime e imprimi-los.
         */
        System.out.println("\nExercicio 1:\n");
        LocalTime localTime1 = LocalTime.of(23, 59, 59);
        LocalDate localDate1 = LocalDate.of(1994, 8, 17);
        LocalDateTime localDateTime1 = LocalDateTime.of(1994, 8, 17, 10, 30, 22);
        System.out.println("Hora: " + localTime1 + "\nData: " + localDate1 + "\nDataHora: " + localDateTime1);

        /*
        2. A partir da data atual, calule e imprima uma compra de valor R$64.000,00 parcelando em 48x.
        Imprima o valor e a data de cada parcela usando a API de datas do Java.
         */
        System.out.println("\nExercicio 2:\n");
        LocalDate localDate2 = LocalDate.now();
        BigDecimal valorCompra = BigDecimal.valueOf(64000);
        BigDecimal quantidadeParcelas = BigDecimal.valueOf(48);
        DateTimeFormatter formatadorDaData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i = 0; i < quantidadeParcelas.intValueExact(); i++) {
            System.out.printf("Parcela %s. Valor: R$%s. Vencimento: %s\n",
                    (i + 1), valorCompra.divide(quantidadeParcelas, MathContext.DECIMAL32), localDate2.plusMonths(i).format(formatadorDaData));
        }

        /*
        3. Usando LocalDate, faça um programa para calcular sua idade.
         */
        System.out.println("\nExercicio 3:\n");
        LocalDate localDate3 = LocalDate.of(1999, 8, 17);
        LocalDate meuAniversario = LocalDate.of(1994, 8, 17);

        int idade = localDate3.getYear() - meuAniversario.getYear();
        if (localDate3.getDayOfYear() < meuAniversario.getDayOfYear()) {
            idade = idade - 1;
        }
        System.out.println("Minha idade: " + idade);


    }
}
