import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        for(int i=0;i<size;i++){
            int value= in.nextInt();
            if(value==0){
                System.out.println(0);
                continue;
            }
            while (value!=0){
                int myNum=value%10;
                System.out.println(myNum+" ");
                value/= 10;
            }
            System.out.println();
        }
    }
}
