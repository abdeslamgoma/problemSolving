import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n= in.nextInt();
        long sum=(n*(n+1))/2;

        System.out.println(sum);
    }
}
