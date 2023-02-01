package ExercisesClass;

import java.time.*;
import java.time.format.DateTimeFormatter;

/*
Converta um objeto Instant para um LocalDateTime e vice versa.
 */
public class Questao3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        Instant instantConverted = localDateTime.toInstant(ZoneOffset.UTC);
        System.out.println(instantConverted);
        System.out.println(instantConverted.toEpochMilli());
        LocalDateTime dateTimeConverted = LocalDateTime.ofInstant(instantConverted, ZoneOffset.UTC);
        System.out.println(dateTimeConverted);
    }
}
