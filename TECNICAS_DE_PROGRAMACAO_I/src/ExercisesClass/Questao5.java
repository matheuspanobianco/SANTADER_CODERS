package ExercisesClass;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

/*
Crie um programa que recebe uma quantidade de segundos e converta e imprima em dias, horas, minutos e segundos.
 */
public class Questao5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entre com os segundos:");
        long seconds = keyboard.nextLong();
        Duration secondsDuration = Duration.ofSeconds(seconds);
        System.out.printf("Transformando em:\nDias:%s;\nHoras:%s;\nMinutos:%s;\nSegundos:%s.",
                secondsDuration.toDays(), secondsDuration.toHours(),
                secondsDuration.toMinutes(), secondsDuration.toSeconds());
    }
}
