package quiz_1;
public class Pattern {
    public static void main(String[] args) {
        int n = 10;  // This defines the size of the pattern

        // Upper Left triangle (A to X)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("  "); // Space between A and B region

            // Upper Right triangle (X to B)
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower Left triangle (D to X)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("  "); // Space between D and C region

            // Lower Right triangle (X to C)
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}