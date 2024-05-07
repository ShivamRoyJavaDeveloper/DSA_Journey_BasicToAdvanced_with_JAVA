package i03conditionals;
import java.util.Scanner;
public class i06_triangleOrNot {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.println("Enter 1st side of triangle");
        int a = dd.nextInt();
        System.out.println("Enter the 2nd side of triangle ");
        int b = dd.nextInt();
        System.out.println("Enter the 3rd side of triangle ");
        int c = dd.nextInt();

        if ((a+b)>c && (b+c)>a && (c+a)>a){
            System.out.println("It can be a triangle!");
        }
        else {
            System.out.println("it can't be any triangle!");
        }
    }
}
