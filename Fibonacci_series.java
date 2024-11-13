package ajinkya;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci_series {
    public static List<Integer> fibonacci(int n) {
        List<Integer> fibSeries = new ArrayList<>();

        if (n >= 1) fibSeries.add(0);
        if (n >= 2) fibSeries.add(1);

        int i = 2;
        do {
            if (i >= n) break;
            int nextNumber = fibSeries.get(i - 1) + fibSeries.get(i - 2);
            fibSeries.add(nextNumber);
            i++;
        } while (i < n);

        return fibSeries;
    }

    public static void main(String[] args) {
        // Ask  the user
        int n = 10;
        List<Integer> fibSeries = fibonacci(n);
        System.out.println(fibSeries);

    }

}
