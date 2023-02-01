package Aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExerciseInClass3 {
    public static void main(String[] args) {
        /*
        1. Escreva um metodo e utilize Predicate,
        que recebe um número e verifica se é par;
         */

        System.out.println("\nExercicio 1:\n");
        List<Integer> numeros = List.of(1, 4, 7, 22, 417);
        List<Integer> numerosPares = verificaPar(numeros, (numero) -> numero % 2 == 0);
        System.out.println(numerosPares);

        /*
        2. Escreva um método utilizando Function,
        que receba um número e retorne o Dobro daquele número;
         */

//        System.out.println("\nExercicio 2:\n");
//        List<Double> numeros2 = List.of(1.2, 4.0, 7.01, 22.0, 417.91);
//        List<Double> numerosDuplicados = duplicaNumero(numeros2, (numero2) -> (numero2 * 2));
//        System.out.println(numerosDuplicados);




        /*
        3. Escreva um método utilizando Consumer,
        para imprimir elementos de uma lista;
         */

//        System.out.println("\nExercicio 3:\n");
//        aves.forEach((ave) -> System.out.println(ave.getNome()));

        /*
        4. Escreva um método utilizando Supplier,
         para retornar uma data com o LocalDate.now();
         */


    }

    public static List<Integer> verificaPar(List<Integer> numeros, Predicate<Integer> filtro) {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            if (filtro.test(numeros.get(i))) {
                numerosPares.add(numeros.get(i));
            }
        }
        return numerosPares;
    }

//    public static void duplicaNumero(List<Double> numeros2, Consumer<Ave> consumidor) {
//
//        for (Ave ave : aves) {
//            consumidor.accept(ave);
//        }
//
//    }
//
//    public static List<String> transformarObjAve(List<Ave> aves, Function<Ave, String> transformador) {
//        List<String> nomesAves = new ArrayList<>();
//
//        for (Ave ave : aves) {
//            nomesAves.add(transformador.apply(ave));
//        }
//
//        return nomesAves;
//    }

}
