package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int nod = 0;
        if (first < second) {
            for (int i = 1; i <= second; i++) {
                if (first % i == 0 && second % i == 0) nod = i;
            }
        } else if (first > second) {
            for (int i = 1; i <= first; i++) {
                if (first % i == 0 && second % i == 0) nod = i;
            }
        } else nod = first;
        System.out.println(nod);
    }
}
