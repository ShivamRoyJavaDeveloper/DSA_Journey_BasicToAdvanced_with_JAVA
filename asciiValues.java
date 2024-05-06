package i02Basics;
import java.util.Scanner;
public class asciiValues {
    public static void main(String[]main){
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(1);
        System.out.println(ch);
        System.out.println((int)ch); //it gives its ASCII values.
        String str=sc.nextLine();
        str.charAt(9);
        char as=str.charAt(9);
        System.out.println(str);
        System.out.println(as);
        System.out.println((int)as);
    }
}
