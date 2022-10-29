package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fib = 0;
        for (int i = 1, first = 0, second = 1; i <= lastFibonacci; i++) {
            fib = first;
            first = second;
            second += fib;
            System.out.println(fib);
        }
    }
}
