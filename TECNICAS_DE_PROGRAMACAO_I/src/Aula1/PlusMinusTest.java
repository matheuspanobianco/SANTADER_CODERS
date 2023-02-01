package Aula1;

import java.time.LocalDateTime;

public class PlusMinusTest {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        System.out.println("Dois dias antes de agora: " + agora.minusDays(2));

        System.out.println("Data de agora: " + agora);

        LocalDateTime agoraModified = agora;

        agoraModified = agoraModified.minusYears(1);
        agoraModified = agoraModified.minusMonths(2);
        agoraModified = agoraModified.minusWeeks(3);
        agoraModified = agoraModified.minusDays(4);
        agoraModified = agoraModified.minusHours(1);
        agoraModified = agoraModified.minusMinutes(3);
        agoraModified = agoraModified.minusSeconds(3);
        System.out.println("Retirando alguns paramentros: " + agoraModified);

        agoraModified = agoraModified.plusSeconds(3);
        agoraModified = agoraModified.plusMinutes(3);
        agoraModified = agoraModified.plusHours(1);
        agoraModified = agoraModified.plusDays(4);
        agoraModified = agoraModified.plusWeeks(3);
        agoraModified = agoraModified.plusMonths(2);
        agoraModified = agoraModified.plusYears(1);
        System.out.println("Retornando os paramentros: " + agoraModified);
    }

}
