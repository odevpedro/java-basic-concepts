import java.util.ArrayList;
import java.util.List;

public class ExemploStream {


    //Aqui eu tenho uma coleção, poderia ser qualquer outra
    private static List<String> funcionarios = List.of("Ana", "Bruno", "Bruna", "Carlos", "Amanda");


    //A declaração do método filtrar: o que ele faz
    public static void filtrar(String letra) {
        funcionarios.stream().filter(nome -> nome.startsWith(letra)).forEach(System.out::println);}

    //A declaração do método filtrar: o que ele faz
    public static void ordenar(String letra){ funcionarios.stream().sorted().filter(a -> a.startsWith(letra)).forEach(System.out::println); }

    //A declaração do método contar: o que ele faz
    public static void contar(String letra){
        long contatodor = funcionarios.stream().filter(a -> a.startsWith(letra)).count(); System.out.println(contatodor);
    }


    public static void main(String[] args) {
        filtrar("A"); // Vai imprimir tudo que começa com a
        ordenar("B"); // Vai imprimir tudo que começa com b
        contar("B"); //Vai contar
    }


    //Ordenando



}
