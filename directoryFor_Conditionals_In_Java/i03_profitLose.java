package i03conditionals;
import java.util.Scanner;
public class i03_profitLose {
    public static void main(String[]args){
        Scanner  jh = new Scanner(System.in);
        double a = jh.nextDouble();
        double b = jh.nextDouble();
        System.out.println("cost price of product is :- "+a);
        System.out.println("Selling price of product is :- "+b);
        if(a>b){
            System.out.println("You made it lose of rupees :- "+(a-b));
        }else if(a<b){
            System.out.println("You make profit of :- "+(b-a));
        }else{
            System.out.println("There is neither profit nor loss!");
        }

    }
}
