package i05LoopPart02;
import java.util.Scanner;
public class i05PracticeProblem {
    public static void main(String[]args){
        Scanner d =new Scanner(System.in);
        int n = d.nextInt();
        System.out.println("The Significant digit of numbers Entered by user");
        int f =0;
        int a =n;
        for(int i=0; i<=a; i++){
            a=a/10;
            f++;
        }
        System.out.println(f);
    }
}
