package i03conditionals;
import java.util.Scanner;
public class i09_TernaryOperators {
    public static void main(String[]args){
        // Q.> Find out if "n" is even or odd using ternary operators
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // condition ? if trur : if false
        System.out.println((n%2==0)?"Even":"Odd");
    }
}
