package ExercisesClass;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*Crie um programa para calcular o numero de anos, meses e dias entre duas datas específicas,
recebidas pelo usuário no formato dd/MM/yyyy, usando a classe Period.
 */
public class Questao1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite a primeira data (dd/mm/aaaa):");
        String firstDate = keyboard.next();

        System.out.println("Digite a segunda data (dd/mm/aaaa):");
        String secondDate = keyboard.next();

        LocalDate firstDateParsed = LocalDate.parse(firstDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate secondDateParsed = LocalDate.parse(secondDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period periodBetween = Period.between(firstDateParsed,secondDateParsed);

        System.out.printf("A diferença entre as datas é: %s anos, %s meses e %s dias.",
                periodBetween.getYears(), periodBetween.getMonths(), periodBetween.getDays());

    }
}
