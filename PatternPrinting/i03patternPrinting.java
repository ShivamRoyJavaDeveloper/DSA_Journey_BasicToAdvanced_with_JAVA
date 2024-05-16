package i07Pattern_Printing;
import java.util.Scanner;
public class i03patternPrinting {
    public static void main(String[]args){
        Scanner d = new Scanner(System.in);
        int n =d.nextInt();

        //1
        for(int i =1; i<=n; i++){
            int k=1;
            for(int j =1; j<=i; j++){
                System.out.print(k+"   ");
                k+=2;
            }
            System.out.println(" ");
        }

        //2
        int k = 1;
        for(int i =1; i<=n; i++){
            k =k;
            for(int j =1; j<=i; j++){
                System.out.print(k+"   ");
                k++;
            }
            System.out.println(" ");
        }

    }
}
