package Examples;

public class UserDTO {

        String name;
        String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
