import java.util.Scanner;

public class FourNumbers
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long result=1;
        for(int i=1;i<=4;i++){
            short num=in.nextShort();
            result*= num;
        }
        System.out.println(result);
    }
}
