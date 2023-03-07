import java.util.Scanner;

public class InvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1 ; i <=n; i++) {
            // First inner loop for space prininting

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Second inner loop for star prininting
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
