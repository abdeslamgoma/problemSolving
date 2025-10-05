import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fWord=in.next();
        String lWord=in.next();
        int pointer=1;
        int x=0;
            for(int j=0;j<lWord.length();j++){
                if(fWord.charAt(x) == lWord.charAt(j)){
                    pointer++;
                    x++;

            }
        }
        System.out.println(pointer);

    }
}
