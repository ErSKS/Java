package javapatternsmorning;

/**
 *
 * @author ErSKS
 */
public class Pattern14 {

    public static void p() {
        System.out.println("\nPattern14");
        int a = 1;
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a - 1);
            }
            a++;
            System.out.println("");
        }
    }
}
