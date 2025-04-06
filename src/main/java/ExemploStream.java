import java.util.ArrayList;
import java.util.List;

public class ExemploStream {


    //Aqui eu tenho uma coleção, poderia ser qualquer outra
    private static List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");


    //A declaração do método filtrar: o que ele faz
    public static void filtrar(String letra) {
        funcionarios.stream()
                .filter(nome -> nome.startsWith(letra))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        filtrar("A"); // Vai imprimir Ana e Amanda
    }


    
}
