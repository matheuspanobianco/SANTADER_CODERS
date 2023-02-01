package Aula1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatTest {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        String novaData = data.format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm a"));
        System.out.println(novaData);
    }
}
