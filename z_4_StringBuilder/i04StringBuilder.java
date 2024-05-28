package i11StringBuilders;
import java.util.Scanner;
public class i04StringBuilder {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String k="The String is immutable!";
        StringBuilder s =new StringBuilder(k);
        System.out.println(s.capacity());
        System.out.println(s.length());
        System.out.println(s.reverse());
        System.out.println(k);
        StringBuilder x=new StringBuilder(78);///by default capacity is 16
        System.out.println(x);

        String a="abcdefghijklmnopqrstuvwxyz";
        char ss=a.charAt(1);
        int aa=(char)ss;

        System.out.println(aa);

        ///// to taking input in String in StringBuilder!
        StringBuilder sk=new StringBuilder(sc.nextLine());
        System.out.println(sk);
        /// for example setCharAt(i,897)
        ///see next!!!!!!!!!!!!!
        StringBuilder sd=new StringBuilder("the Sring!");
        sd.setCharAt(0,'d');
        System.out.println(sd);


    }
}
