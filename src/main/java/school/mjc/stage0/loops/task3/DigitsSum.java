package school.mjc.stage0.loops.task3;


public class DigitsSum {
    public void printDigitsSum(int t){
        String tString = Integer.toString(t);
        int sum = 0;
        for (int i = 0; i < tString.length(); i++) {
            if (t < 0) t = t * (-1);
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);
    }
}
