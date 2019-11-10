package Wyklad5;

public class TabulatorTester {
    public static void main(String[] args) {

        LinearFunction f1 = new LinearFunction();
        Tabulator tabulator1 = new Tabulator(0., 2., 5, f1);

        Tabulator tabulator2 = new Tabulator(0., 2., 5, new ScalarFunction() {
            @Override
            public double f(double x) {
                return 2 * x;
            }
        });

        Tabulator tabulator3 = new Tabulator(0., 2., 5,
                (x) -> 2 * x //wyrażenie lambda
        );

        System.out.println("Wyrażenie lambda");
        tabulator3.tabulate();

        Tabulator tabulator4 = new Tabulator(0., 2., 5,
                (x) -> Math.sin(x) //wyrażenie lambda
        );

        System.out.println("Wyrażenie lambda 2");
        tabulator4.tabulate();


        Tabulator tabulator5 = new Tabulator(0., 2., 5,
                Math::sin //wyrażenie lambda
        );

        System.out.println("Wyrażenie lambda: referencja do metody");
        tabulator4.tabulate();
    }
    // wyrażenie lambda ma duże znaczenie dla programowania tzw. funkcyjnego
}
