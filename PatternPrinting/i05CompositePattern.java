package i07Pattern_Printing;
import java.util.Scanner;
public class i05CompositePattern {
    public static void main(String []args){
        Scanner k =new Scanner(System.in);
        int n =k.nextInt();
        //1
        for (int i =1;i<=n; i++){
            for(int p=1; p<=n-i; p++){
                System.out.print("  ");
            }
            for(int o =1; o<=n;o++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //2
        for(int i=1; i<=n; i++){
            for(int l=1;l<=n-i;l++){
                System.out.print("   ");
            }
            for(int s =1; s<=2*i-1;s++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //3

    }
}
