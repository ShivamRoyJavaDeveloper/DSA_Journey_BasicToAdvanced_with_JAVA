package i03conditionals;
import java.util.Scanner;
public class i01_if_else {
    public static void main(String[]args){
        Scanner jl =new Scanner(System.in);
        int a =jl.nextInt();

        if(a%2==0) {
        System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }


        // Modulus --> always give positive numbers

        // if numbers are negative then print with -ve sign
        // if numbers are other than negaticve then print with +ve sign

        int  d = jl.nextInt();
        if (d<0){
            System.out.println(-d);
        }
        else System.out.println(d);

    }
}
