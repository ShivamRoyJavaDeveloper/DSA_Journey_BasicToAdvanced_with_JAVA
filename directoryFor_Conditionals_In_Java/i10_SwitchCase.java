package i03conditionals;
import java.util.Scanner;
public class i10_SwitchCase {
    public static void main(String[]args){
    Scanner sd = new Scanner(System.in);
    // create a calculator
    float a = sd.nextFloat();
    float b = sd.nextFloat();
    char op = sd.next().charAt(0);

//    if (op == '+') System.out.println(a+b);
//    if (op == '_') System.out.println(a-b);
//    if (op == '*') System.out.println(a*b);
//    if (op == '/') System.out.println(a/b);

        switch(op){
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> System.out.println(a/b);
        }



    }

}
