package i05LoopPart02;
import java.util.Scanner;
public class i05Practicez {
    public static void main(String[]args){
        Scanner d = new Scanner(System.in);
        int n=d.nextInt();
        int a =0;
        while(n!=0){
            n/=10;
            a++;
        }
        System.out.println(a);
    }
}
