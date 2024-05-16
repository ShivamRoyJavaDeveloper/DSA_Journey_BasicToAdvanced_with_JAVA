package i07Pattern_Printing;
import java.util.Scanner;
public class i08PracticeProblem {
    public static void main(String[]args){
        Scanner f=new Scanner(System.in);
        int n =f.nextInt();
        //1
        //print diamond shape

        for(int i=1; i<=n; i++){
            for(int j =1; j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
        for(int i=1; i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("   ");
            }
            for(int j=1; j<=2*n-1-2*i;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
