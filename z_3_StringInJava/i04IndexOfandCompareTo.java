package i10Sstring;
import java.util.Scanner;
public class i04IndexOfandCompareTo {
    public static void main(String[]args){
        //see the java notes of Harry!
        String str="Shivam Roy";
        String tr="Shivam Roy Roy Roy Roy";
        int k=str.indexOf('o');
        int d=str.indexOf('R');
        int f=tr.indexOf('R',8);
        int dd=tr.lastIndexOf( 'R');
        int ddd=tr.lastIndexOf( 'R',7);
        int dddd=tr.lastIndexOf( 'R',15);
//        System.out.println(k+"  "+d+"  "+dd+"  "+ddd+"  "+dddd+"  "+f);

        ComapareTo();

    }
    static void ComapareTo(){
        //  ComapareTo
        String a ="abc";
        String x ="abcc";
        String b ="abc";
        System.out.println(a.compareTo(b));   // a-b if same continue else break;
        System.out.println(x.compareTo(b));   //give no.of extra characters;
    }
}
