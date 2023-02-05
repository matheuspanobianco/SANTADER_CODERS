package Aula4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciseInClass {
    public static void main(String[] args) {
        /*
1) Filtragem de dados: dada uma lista de números inteiros
crie uma stream finita e use o método filter para retornar apenas os números pares.
___*/

        Stream<Integer> streamInteiros = Stream.of(1, 3, 4, 6, 8, 11);
        streamInteiros.filter(numero -> numero % 2 == 0).forEach(System.out::println);

        /*
2) Agregação de dados: dada uma lista de números inteiros
crie uma stream finita e use o método reduce para calcular a soma de todos os números.
___*/
        Stream<Integer> streamInteiros2 = Stream.of(1, 3, 4, 6, 8, 11);
        Optional<Integer> soma = streamInteiros2.reduce((acumulador, numero) -> acumulador + numero);
        System.out.println(soma.get());
        /*
3) Transformação de dados: dada uma lista de strings
crie uma stream finita e use o método map para convertê-las em números inteiros.
___*/
        List<String> nomes = List.of("Lix", "da", "Cunha");
        List<Integer> oie = nomes.stream().map(nome -> nome.length()).toList();
        System.out.println(oie);

        /*
4) Ordenação de dados: dada uma lista de números inteiros
crie uma stream finita e use o método sorted para classificá-los em ordem crescente.
___

*/

        List<Integer> listaInteiros = List.of(17, 14, 3, 6, 39);
        List<Integer> listaInteirosOrdenados = listaInteiros.stream().sorted(Comparator.comparingInt(numero -> numero)).toList();
        System.out.println(listaInteirosOrdenados);

/*

5) Crie o objeto Pessoa com os atributos nome:string e idade:integer
no metodo main inicialize uma lista de pessoas
use a stream para:
- filtrar somente pessoas com mais de 18 anos de idade
 - tranformar em uma lista somente dos nomes dessas pessoas
 - limitar a no máximo 3 resultados
 - transformar a stream em Set
e imprima essa coleção.
 */

        Pessoa pessoa1 = new Pessoa("Matheus", 42);
        Pessoa pessoa2 = new Pessoa("Ana", 16);
        Pessoa pessoa3 = new Pessoa("Lix", 18);
        Pessoa pessoa4 = new Pessoa("Blank", 19);
        Pessoa pessoa5 = new Pessoa("Cunha", 21);
        Pessoa pessoa6 = new Pessoa("Paolucci", 22);
        Pessoa pessoa7 = new Pessoa("Agostini", 19);
        Pessoa pessoa8 = new Pessoa("Penariol", 32);
        List<Pessoa> listaPessoas = List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7, pessoa8);
        Set<String> listaNomes = listaPessoas.stream()
                .filter(pessoa -> pessoa.idade > 18)
                .map(pessoa -> pessoa.nome)
                .limit(3)
                .collect(Collectors.toSet());
        System.out.println(listaNomes);

    }

    public record Pessoa(String nome, Integer idade) {
    }

}
