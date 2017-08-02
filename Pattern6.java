package javapatternsmorning;

/**
 *
 * @author ErSKS
 */
public class Pattern6 {

    public static void p() {
        System.out.println("\nPattern6");
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println(" ");

        }

    }
}
