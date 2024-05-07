package i03conditionals;
import java.util.Scanner;
public class i02_absolute_values {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float a =sc.nextFloat();
        if(a<0){
            System.out.println(-a);
        }else {
            System.out.println(a);

        }
    }
}
