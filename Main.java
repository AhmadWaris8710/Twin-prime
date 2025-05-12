import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<int[]> twinPrimes = findTwinPrimes(1000);
        for (int[] pair : twinPrimes) {
            System.out.printf("(%d, %d)\n", pair[0], pair[1]);
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static List<int[]> findTwinPrimes(int limit) {
        List<int[]> twinPrimes = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                twinPrimes.add(new int[]{i, i + 2});
            }
        }
        return twinPrimes;
    }
}