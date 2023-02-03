package Aula3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
        //maneira direta
        Predicate<Integer> numeroEhPar = (numeroInserido) -> numeroInserido % 2 == 0;
        System.out.println(numeroEhPar.test(2));

        /*
        2. Escreva um método utilizando Function,
        que receba um número e retorne o Dobro daquele número;
         */

        System.out.println("\nExercicio 2:\n");
        List<Integer> numeros2 = List.of(1, 4, 7, 22, 417);
        List<Integer> numerosDuplicados = duplicaNumero(numeros2, (numero2) -> numero2 * 2);
        System.out.println(numerosDuplicados);
        //maneira direta
        Function<Integer, Integer> numeroDobrado = (numeroInserido) -> numeroInserido * 2;
        System.out.println(numeroDobrado.apply(2));

        /*
        3. Escreva um método utilizando Consumer,
        para imprimir elementos de uma lista;
         */

        System.out.println("\nExercicio 3:\n");
        List<String> nomes = List.of("Marcelo", "Matheus", "Ana", "Carlos");
        imprimeNomes(nomes, (nome) -> System.out.println(nome));
        //maneira direta
        Consumer<List<String>> imprimeElementosLista = (listaNomes) -> System.out.println(listaNomes.toString());
        imprimeElementosLista.accept(nomes);
        /*
        4. Escreva um método utilizando Supplier,
         para retornar uma data com o LocalDate.now();
         */

        System.out.println("\nExercicio 4:\n");
        Supplier<LocalDate> forneceLocalDate = () -> LocalDate.now();
        System.out.println(forneceLocalDate.get());


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

    public static void imprimeNomes(List<String> nomes, Consumer<String> consumidor) {
        for (String nome : nomes) {
            consumidor.accept(nome);
        }
    }

    public static List<Integer> duplicaNumero(List<Integer> numeros2, Function<Integer, Integer> transformador) {
        List<Integer> numeros2Duplicados = new ArrayList<>();

        for (Integer numero2 : numeros2) {
            numeros2Duplicados.add(transformador.apply(numero2));
        }

        return numeros2Duplicados;
    }

}
