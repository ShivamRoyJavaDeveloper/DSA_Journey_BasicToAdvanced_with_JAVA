package i07Pattern_Printing;
import java.util.Scanner;
public class i01SquareTypePrinting {
    public static void main(String[]args){
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();
        System.out.println("Print a pattern such that n no. of rows and n+1 no. of column");

        for(int a = 1; a<=n; a++){
        for(int i =1; i<=n;i++) {
            System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println(" \n");

        // print pattern

        int d =0;
        for(int a = 1; a<=n; a++){
            d=1;
            for(int i =1; i<=n;i++) {
                System.out.print(d+"  ");
                d++;
            }
            System.out.println("");
        }
        System.out.println("\n");

        // print a pattern
        int s =1;
        for(int a = 1; a<=n; a++){
            s=s;
            for(int i =1; i<=n;i++) {
                System.out.print(s+"  ");
            }
            s++;
            System.out.println("");
        }
        System.out.println(" \n");

        char a ;
        for(int i =1; i<=n; i++){
            a=65;
            for (int j=1; j<=n; j++){
                System.out.print(a+"  ");
                a++;
            }
            System.out.println("");
        }
        System.out.println("\n");

        //print a pattern
        char c=65 ;
        for(int i =1; i<=n; i++){
            c=c;
            for (int j=1; j<=n; j++){
                System.out.print(c+"  ");
            }
            c++;
            System.out.println("");
        }

    }
}
