import ru.netology.services.RelaxService;

public class Main {
    public static void main(String[] args) {

        RelaxService service = new RelaxService();

        System.out.println(service.calcMonth(10_000, 3000, 20_000));
        System.out.println(service.calcMonth(100_000, 60_000, 150_000));
    }
}