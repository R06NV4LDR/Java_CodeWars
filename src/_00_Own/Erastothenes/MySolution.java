package _00_Own.Erastothenes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MySolution {
    public static int[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; ++i) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return IntStream.range(0, isPrime.length)
                .filter(i -> isPrime[i])
                .toArray();
    }

    public static void main(String[] args) {
        int n = 1000;
        int[] primes = sieve(n);
        System.out.println(Arrays.toString(primes));
    }
}
