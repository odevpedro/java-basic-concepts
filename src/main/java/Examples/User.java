package Examples;

public class User {
    String name;
    String email;
    String password;

    public User(String name, String mail) {
        this.name = name;
        this.email = mail;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
