package i04LoopPart01;
import java.util.Scanner;
public class i06_ArithmaticPrigration {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        // Display this AP 1,3,4,5,7,9  upto n term

        for (int i =1; i<=1+(n-1)*2; i+=(3-1)){
            System.out.print(i+" ");

        }
    }
}
