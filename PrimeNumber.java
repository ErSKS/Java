package cjt;

/**
 *
 * @author ErSKS
 */
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Q1. Checking Prime Numbers:");
        System.out.println("Prime Check: 0 false:" + isPrime(0));
        System.out.println("Prime Check: 1 false:" + isPrime(1));
        System.out.println("Prime Check: 2 true:" + isPrime(2));
        System.out.println("Prime Check: 3 true:" + isPrime(3));
        System.out.println("Prime Check: 4 false:" + isPrime(4));
        System.out.println("Prime Check: -4 false:" + isPrime(-4));

        System.out.println("\nGenerating Prime Numbers less than 100:");
        generatePrimes(100);
        System.out.println("\n");
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int countFactor = 0;
        boolean result = true;
        for (int i = 1; i < n && result == true; i++) {
            if (n % i == 0) {
                countFactor++;
            }
            if (countFactor > 1) {
                result = false;
            }
        }
        return result;
    }

    static void generatePrimes(int n) {

        for (int i = 1; i < n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
}
