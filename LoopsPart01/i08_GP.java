package i04LoopPart01;
import java.util.Scanner;
public class i08_GP {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        // Display GP 1,2,4,8,16,32
        int n = sc.nextInt();
        for(int i=1; i<=n; i*=2){
            System.out.print(i+" ");

        }
            }
}
