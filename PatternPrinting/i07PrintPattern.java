package i07Pattern_Printing;
import java.util.Scanner;
public class i07PrintPattern {
    public static void main(String[]args){
        Scanner f =new Scanner(System.in);
        int n =f.nextInt();
        //1
        for(int j=1;j<=2*n-1;j++){
            System.out.print(j+"  ");
        }
        System.out.println("");
        int k=6;
        for(int i=1; i<=n;i++){
            k=n+i;
            for(int j=1; j<=n-i;j++){
                System.out.print(j+"  ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=n-i;j++){
                System.out.print(k+++"  ");
            }
            System.out.println("");
        }
    }
}
