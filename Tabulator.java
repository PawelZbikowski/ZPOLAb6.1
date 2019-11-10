package Wyklad5;

public class Tabulator {
    private double a;
    private double b;
    private  int n;
    private ScalarFunction scalarFunction;

    public Tabulator(double a, double b, int n, ScalarFunction scalarFunction) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.scalarFunction = scalarFunction;
    }

    public void tabulate() {
        double x = a;
        double dx = (b-a)/(n-1);
        for (int i = 0; i < n; i++) {
            double y = scalarFunction.f(x);
            System.out.println("x = " + x + ", y = " + y);
            x += dx;

        }
    }
}
