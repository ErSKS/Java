package javapatternsmorning;

/**
 *
 * @author ErSKS
 */
public class Pattern13 {

    public static void p() {
        System.out.println("\nPattern13");
        int a = 1;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.printf("0");
                } else {
                    System.out.printf("1");
                }
            }
            System.out.println("");
        }
    }
}
