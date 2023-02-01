package ExercisesClass;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

/*
    Para gestão dos períodos de vacinação, você é responsável por criar um programa que receba
a data de vacina e imprima as próximas 3 doses baseado nas seguintes regras;
As doses devem ser ministradas de 3 em 3 meses
    Como os postos de vacinação só abrem em dias da semana se a data da vacinação for sábado,
deve ser antecipada para sexta, caso dê num domingo deve ser ministrada na segunda.
 */
public class Questao6 {
    public static void main(String[] args) {
        System.out.println("Digite a data da primeira vacina (dd/mm/aaaa):");
        Scanner keyboard = new Scanner(System.in);
        String vaccinationDay = keyboard.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate vaccinationLocalDate = LocalDate.parse(vaccinationDay, formatter);
        System.out.println("Primeira vacina: ");
        changeDay(vaccinationLocalDate, formatter, 0);
        System.out.println("Proximas vacinas:");
        int numberOfVaccines = 3;
        for (int i = 1; i <= numberOfVaccines ; i++) {
            LocalDate nextVaccinationLocalDate = vaccinationLocalDate.plusMonths(numberOfVaccines * i);
            changeDay(nextVaccinationLocalDate, formatter, i);
        }
    }
    public static void changeDay(LocalDate vaccineChange, DateTimeFormatter formatter, int i){
        if (vaccineChange.getDayOfWeek() == SATURDAY) {
            vaccineChange = vaccineChange.minusDays(1);
            System.out.println(vaccineChange.format(formatter) +" - "+ vaccineChange.getDayOfWeek());
        } else if (vaccineChange.getDayOfWeek() == SUNDAY) {
            vaccineChange = vaccineChange.plusDays(1);
            System.out.println(vaccineChange.format(formatter) +" - "+ vaccineChange.getDayOfWeek());
        } else {
            System.out.println(vaccineChange.format(formatter) +" - "+ vaccineChange.getDayOfWeek());
        }
    }
}
