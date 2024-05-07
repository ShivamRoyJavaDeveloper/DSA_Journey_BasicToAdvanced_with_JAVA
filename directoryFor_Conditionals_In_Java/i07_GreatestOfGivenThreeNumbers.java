package i03conditionals;
import java.util.Scanner;
public class i07_GreatestOfGivenThreeNumbers {
    public static void main(String[]args){
        Scanner dd = new Scanner(System.in);
        System.out.println("Enter the 1st input");
        float a = dd.nextFloat();
        System.out.println("Enter the 2nd input");
        float b = dd.nextFloat();
        System.out.println("Enter the 3rd input");
        float c = dd.nextFloat();

        System.out.println("The greatest input is !");
        if (a>b && a>c)    {
            System.out.println(a);
        }
         else if(b>a && b>c){
             System.out.println(b);
        }
         else if(c>a && c>b){
             System.out.println(c);
        }
         else{
             System.out.println("All are equal");
        }
    }
}