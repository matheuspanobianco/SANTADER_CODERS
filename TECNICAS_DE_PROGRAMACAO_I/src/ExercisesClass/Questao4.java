package ExercisesClass;

import java.time.*;
import java.util.Calendar;

/*
Compare a diferença entre dois objetos Instant e imprima o resultado em Horas, Minutos e Segundos.
 */
public class Questao4 {
    public static void main(String[] args) {

        LocalDateTime localDateTime =
                LocalDateTime.of(2023,2,1,10,0,0);
        Instant instant1 = localDateTime.toInstant(ZoneOffset.UTC);
        System.out.println(instant1);

        Instant instant2 = Instant.now();
        System.out.println(instant2);

        System.out.println();
        Duration compareInstantsDuration = Duration.between(instant1,instant2);
        System.out.printf("Diferença total entre Instants em:\nHoras:%s;\nMinutos:%s;\nSegundos:%s.",
                compareInstantsDuration.toHours(), compareInstantsDuration.toMinutes(), compareInstantsDuration.toSeconds());
    }
}
