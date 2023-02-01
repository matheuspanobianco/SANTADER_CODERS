package ExercisesClass;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
Meça o tempo de execução de um bloco de código usando a classe Duration.
 */
public class Questao2 {
    public static void main(String[] args) {

        LocalTime localTimeStart = LocalTime.now();

        //Inicio do bloco de codigo
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite a primeira data (dd/mm/aaaa):");
        String firstDate = keyboard.next();

        System.out.println("Digite a segunda data (dd/mm/aaaa):");
        String secondDate = keyboard.next();

        LocalDate firstDateParsed = LocalDate.parse(firstDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate secondDateParsed = LocalDate.parse(secondDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period periodBetween = Period.between(firstDateParsed,secondDateParsed);

        System.out.printf("A diferença entre as datas é: %s anos, %s meses e %s dias.\n",
                periodBetween.getYears(), periodBetween.getMonths(), periodBetween.getDays());
        //Fim do bloco de codigo

        LocalTime localTimeFinish = LocalTime.now();

        Duration durationBetween = Duration.between(localTimeStart,localTimeFinish);
        System.out.println("\nTempo total de execução do bloco de código calculado em:");
        System.out.printf("Minutos: %s\nSegundos: %s\nMilissegundos: %s",
                durationBetween.toMinutes(), durationBetween.toSeconds(), durationBetween.toMillis());
    }
}
