package HackerRank.OOP.JavaInterface;

public class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
       int some = 0;
        for (int i = 1; i <= n; i++) {
            int result = n % i ;       // resto dessa divisão
            if (result == 0) {
                some = some + i;
            }
        }
        return some;
    }

}
