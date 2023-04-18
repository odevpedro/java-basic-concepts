import java.util.List;

public class Stream {
    static List<String> funcionarios;

    public static void filtrar(String letra){
        funcionarios.stream().filter(a -> a.startsWith(letra)).forEach(System.out::print);)
    }
    
}
