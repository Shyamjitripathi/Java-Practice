import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int ans = input*(input+1)/2;
        System.out.print(ans);
    }
}
