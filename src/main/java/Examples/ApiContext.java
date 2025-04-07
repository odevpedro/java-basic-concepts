package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApiContext {
    //GET /products?minPrice=100&page=2&size=10

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Notebook", 3000.00),
                new Product("Mouse", 80.00),
                new Product("Monitor", 800.00),
                new Product("Monitor", 800.00),
                new Product("Monitor", 800.00),
                new Product("Monitor", 800.00)

        );

        products.stream()
                .filter(p -> p.getPrice() > 100)
                .skip(0)
                .limit(4)
                .forEach(System.out::println);


}

//Trabalhando com dto de maneira funcional
//map -> transforme cada elemento em outro


    List<User> users = List.of(
            new User("Ana", "ana@email.com"),
            new User("Bruno", "bruno@email.com")
    );

    //- Criando dto a partir de modelo
    List<UserDTO> result = users.stream()
            .map(user -> new UserDTO(user.getName(), user.getEmail()))
            .collect(Collectors.toList());

    //anyMatch - existe algum elemento na lista que satifaz a condição?
    boolean hasInvalidEmails = users.stream()
            .anyMatch(user -> !user.getEmail().contains("@"));


}
