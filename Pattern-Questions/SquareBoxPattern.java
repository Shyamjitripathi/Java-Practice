import java.util.Scanner;

public class SquareBoxPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for( int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < m ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
