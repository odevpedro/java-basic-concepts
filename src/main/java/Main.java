public class Main {
    public static void main(String[] args) {
        String message = greatUser("Lucas", "Red");
        greatUser("Pedro", "Hamilton");

    }

    public static String greatUser(String name, String lastName){
       return  "Hello" + name + " " + lastName;
    }
}
