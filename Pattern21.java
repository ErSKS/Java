package javapatternsmorning;

/**
 *
 * @author ErSKS
 */
public class Pattern21 {

    public static void p() {
        System.out.println("\nPattern21");
        final int N = 15, M = N / 2 + 1;
        for (int i = 1; i <= N - M; i++) {
            for (int j = 1; j <= N; j++) {
                if (j <= i || j > N - i) {
                    if (j % 2 == 1) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = N - M + 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j <= M - (i - M) || j >= M + (i - M)) {
                    if (j % 2 == 1) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
