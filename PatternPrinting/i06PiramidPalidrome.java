package i07Pattern_Printing;
import java.util.Scanner;
public class i06PiramidPalidrome {
    public static void main(String[]args){
        Scanner c=new Scanner(System.in);
        int n =c.nextInt();
        //1
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+"  ");
            }
            for(int l =i-1; l>=1; l--){
                System.out.print(l+"  ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //2
        //Make a star bridge
        for(int j=1;j<=2*n-1;j++){
            System.out.print("*  ");
        }
        System.out.println("");
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print("*  ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=n-i;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
