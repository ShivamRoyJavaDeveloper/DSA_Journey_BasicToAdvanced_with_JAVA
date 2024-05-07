package i03conditionals;
import java.util.Scanner;
public class i05_rlationalOperators {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%5==0 || a%3==0){
            System.out.println("the nunber is divisible by 3 or 5");
            }
        else{
            System.out.println("the number is neither divisible by 3 nor 5");
        }
    }
}
