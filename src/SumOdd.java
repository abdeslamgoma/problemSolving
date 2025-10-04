import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rep= in.nextInt();
        for(int j=1;j<=rep;j++){
            int m1=in.nextInt();
            int m2 =in.nextInt();
            int n1,n2;
            if(m1<m2){
                n1=m1;
                n2=m2;
            }else{
                n1=m2;
                n2=m1;
            }
            int sum=0;
            for(int i= n1;i<n2-1;i++){
                if((i+1)%2!=0){
                    sum+=i+1;
                }
            }
            System.out.println(sum);
        }

    }
}
