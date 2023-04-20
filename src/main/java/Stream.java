import java.util.ArrayList;
import java.util.List;

public class Stream {
    static List<String> funcionarios;

        //métodos: filtrar ordenar e contar

        public static void filtrar(String letra){
            funcionarios.stream().filter(a -> a.startsWith(letra)).forEach(System.out::println);
        }

        public static void ordenar(String letra){
        funcionarios.stream().sorted().filter(a -> a.startsWith(letra)).forEach(System.out::println);
        }

        public static void contar(String letra){
            long contatodor = funcionarios.stream().filter(a -> a.startsWith(letra)).count();
            System.out.println(contatodor);
        }

    public static void main(String[] args) {
        funcionarios = new ArrayList<>();
        funcionarios.add("Antonio");
        funcionarios.add("José");
        funcionarios.add("Pedro");
        funcionarios.add("João");
        funcionarios.add("Andréia");
        filtrar("A");
        ordenar("A");
        contar("A");

    }


    
}
