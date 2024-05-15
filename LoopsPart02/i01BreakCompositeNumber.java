package i05LoopPart02;
import java.util.Scanner;
public class i01BreakCompositeNumber {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        // Check n is a composite number or not!
        for (int i=2; i<=n-1; i++){
            if (n%i==0){
                System.out.println("Composite Number!");
                break;
            }
       }
    }
}
