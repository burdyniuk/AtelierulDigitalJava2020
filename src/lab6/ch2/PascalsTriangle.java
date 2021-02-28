package lab6.ch2;

public class PascalsTriangle {

    // compute the factorial of num / num!
    static int fact(int num) {
        int factorial;

        for (factorial = 1; num > 1; num--) {
            factorial *= num;
        }
        return factorial;
    }

    static int fun(int n, int r) {
        return fact(n) / (fact(n-r) * fact(r));
    }
}
