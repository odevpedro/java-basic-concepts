package Examples;

import java.util.*;
import java.util.stream.Collectors;

public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User("Ana", "ana@email.com"));
        users.add(new User("Bruno", "bruno@email.com"));
        users.add(new User("Carlos", "carlos.email.com")); // inválido
        users.add(new User("Amanda", "amanda@email.com"));
        users.add(new User("Lucas", "lucas@email.com"));
    }

    // 1. Retornar todos os e-mails válidos
    public List<String> getValidEmails() {
        return users.stream()
                .filter(user -> user.getEmail().contains("@"))
                .map(User::getEmail)
                .collect(Collectors.toList());
    }

    // 2. Retornar os 3 primeiros usuários ordenados por nome
    public List<User> getTop3OrderedUsers() {
        return users.stream()
                .sorted(Comparator.comparing(User::getName))
                .limit(3)
                .collect(Collectors.toList());
    }

    // 3. Verifica se existe algum e-mail inválido
    public boolean hasInvalidEmails() {
        return users.stream().anyMatch(user -> !user.getEmail().contains("@"));
    }

    // 4. Verifica se todos têm e-mails válidos
    public boolean allEmailsValid() {
        return users.stream()
                .allMatch(user -> user.getEmail().contains("@"));
    }

    // 5. Verifica se nenhum e-mail é vazio
    public boolean noEmptyEmails() {
        return users.stream()
                .noneMatch(user -> user.getEmail().isEmpty());
    }

    // 6. Contar quantos usuários têm nome começando com "A"
    public long countUsersStartingWithA() {
        return users.stream()
                .filter(user -> user.getName().startsWith("A"))
                .count();
    }

    // 7. Exibir todos os nomes formatados em maiúsculas
    public List<String> getNamesUppercase() {
        return users.stream()
                .map(user -> user.getName().toUpperCase())
                .collect(Collectors.toList());
    }

    // 8. Pular os 2 primeiros e listar o resto
    public List<User> skipFirstTwoUsers() {
        return users.stream()
                .skip(2)
                .collect(Collectors.toList());
    }

    // Método auxiliar para imprimir os usuários
    public void printUsers(List<User> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        UserService service = new UserService();

        System.out.println("1. E-mails válidos:");
        service.getValidEmails().forEach(System.out::println);

        System.out.println("\n2. Top 3 usuários ordenados:");
        service.printUsers(service.getTop3OrderedUsers());

        System.out.println("\n3. Existe e-mail inválido? " + service.hasInvalidEmails());
        System.out.println("4. Todos os e-mails são válidos? " + service.allEmailsValid());
        System.out.println("5. Nenhum e-mail está vazio? " + service.noEmptyEmails());
        System.out.println("6. Quantos começam com 'A'? " + service.countUsersStartingWithA());

        System.out.println("\n7. Nomes em maiúsculo:");
        service.getNamesUppercase().forEach(System.out::println);

        System.out.println("\n8. Pulando os 2 primeiros:");
        service.printUsers(service.skipFirstTwoUsers());
    }
}
