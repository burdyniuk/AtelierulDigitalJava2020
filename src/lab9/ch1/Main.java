package lab9.ch1;

public class Main {
    public static void main(String[] args) {
        Challenge1 ch1 = new Challenge1();
        ch1.emptyFlux().subscribe(System.out::println);
        ch1.fooBarFluxFromValues().subscribe(System.out::println);

        try {
            ch1.errorFlux().subscribe(System.out::println);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
