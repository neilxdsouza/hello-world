
public class App {

    private final String message = "Hello, World";

    public App() {}

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }

    String getMessage() {
        return message;
    }
}
