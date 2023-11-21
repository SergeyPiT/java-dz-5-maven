import ru.netology.services.RestService;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        System.out.println(service.restCalc(100_000, 60_000, 150_000));
    }
}
