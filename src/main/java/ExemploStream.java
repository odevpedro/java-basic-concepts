import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemploStream {


    private static List<String> funcionarios = List.of("Ana", "Bob", "Ru",  "Bruno", "Bruna", "Carlos", "Amanda");


    //A declaração do método filtrar: o que ele faz
    public static void filtrar(String letra) {
        funcionarios.stream().filter(nome -> nome.startsWith(letra)).forEach(System.out::println);}


    public static void ordenar(String letra){ funcionarios.stream().sorted().filter(a -> a.startsWith(letra)).forEach(System.out::println); }


    public static void contar(String letra){
        long contatodor = funcionarios.stream().filter(a -> a.startsWith(letra)).count(); System.out.println(contatodor);
    }



    public static void mapear() {
        funcionarios.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
    public static void todosComecamCom(String letra) {
        boolean todosFuncionarios = funcionarios.stream().allMatch(nome -> nome.startsWith(letra));
        System.out.println(todosFuncionarios ? "Todos começam com " + letra : "Nem todos começam com " + letra);
    }


    public static void primeiroNome() {
        funcionarios.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void novaListaComMaisDeQuatroLetras() {
        List<String> resultado = funcionarios.stream()
                .filter(nome -> nome.length() > 4)
                .collect(Collectors.toList());

        System.out.println("Nomes com mais de 4 letras: " + resultado);
    }

    public static void apelidos(){
        List<String> apelidos = funcionarios.stream().filter(nome -> nome.length() < 4)
                .collect(Collectors.toList());

        System.out.println("Possiveis apelidos na lista: " + apelidos);
    }

    public static void nomesJuntos() {
        String nomes = funcionarios.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Funcionários: " + nomes);
    }


    public static void agruparPorTamanho() {
        Map<Integer, List<String>> agrupado = funcionarios.stream()
                .collect(Collectors.groupingBy(String::length));

        agrupado.forEach((tamanho, nomes) ->
                System.out.println("Tamanho " + tamanho + ": " + nomes)
        );
    }








    public static void main(String[] args) {
        filtrar("A");
        ordenar("B");
        contar("B");
        mapear(); //manda todos pra upperCase
        todosComecamCom("A");
        primeiroNome();
        novaListaComMaisDeQuatroLetras();
        apelidos();
        nomesJuntos();


    }


    //Ordenando



}
