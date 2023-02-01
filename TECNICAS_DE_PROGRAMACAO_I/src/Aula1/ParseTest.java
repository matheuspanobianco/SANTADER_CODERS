package Aula1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseTest {
    public static void main(String[] args) {

        String data = "17/08/1994";
        LocalDate dataFormatada = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(dataFormatada);

        String data2 = "27-11-1996";
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataFormatada2 = LocalDate.parse(data2, formatador);
        System.out.println(dataFormatada2);

        String dataTempo = "25/07/1968 9:21 AM";
        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm a");
        LocalDateTime dataHoraFormatada = LocalDateTime.parse(dataTempo, formatador2);
        System.out.println(dataHoraFormatada);

    }
}
