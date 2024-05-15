package i05LoopPart02;
import java.util.Scanner;
public class i01LoopPrimeNumber {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        int n = df.nextInt();
        int x=0;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    System.out.println("It is a composite number!");
                    x=1;
                    break;
                }
            }

            if(n==1 || n==0){
                System.out.println("Neither Prime nor Composite!");
            }

            else if(x!=1){
                System.out.println("it is a prime number!");
            }

        System.out.println("congratulation!");
    }
}
