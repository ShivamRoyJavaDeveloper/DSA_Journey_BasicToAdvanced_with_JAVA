package i04LoopPart01;
import java.util.Scanner;
public class i07_AP {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //print upto nth term
        int n =sc.nextInt();
        // Ap 2,4,6,8......
        int a =2, d=2;
        for (int i =1; i<=n; i++){

            System.out.print(a+" ");
            a +=2;
        }
    }
}
