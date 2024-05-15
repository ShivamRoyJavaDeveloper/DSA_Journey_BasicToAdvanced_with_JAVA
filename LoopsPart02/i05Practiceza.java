package i05LoopPart02;
import java.util.Scanner;
public class i05Practiceza {
    public static void main(String[]args){
        Scanner d =new Scanner(System.in);
        int n =d.nextInt();
        System.out.println("The SUM of digit of user input");
        int a;
        int b=0;
        for(int i=n; n!=0; ){
            a=n;
            n=n/10;
            n=n*10;
            a=a-n;
            b=b+a;
            n=n/10;
        }
        System.out.println(b);
    }
}