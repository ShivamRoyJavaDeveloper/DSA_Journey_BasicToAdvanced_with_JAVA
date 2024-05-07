package i03conditionals;
import java.util.Scanner;
public class i04_operatorsAndOrOperators {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("To check the given input is 3 digit no. or not");
        System.out.println("Enter your input");
        float a = sc.nextFloat();
        if (a<1000 && a>=100){
            System.out.println("Your given input is a three digit number!\nCongratulation!   You Win");
        }
        else{
            System.out.println("It is not a three digit number!\n Try Again!");

        }
    }
}
