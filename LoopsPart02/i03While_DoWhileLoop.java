package i05LoopPart02;
import java.util.Scanner;
public class i03While_DoWhileLoop {
    public static void main(String[]args){
        Scanner f=new Scanner(System.in);
        int n=f.nextInt();
        int i=0;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        int a= 0;
        System.out.println("\n");
        for(;a<=n; ){
            System.out.print(a+" ");
            a++;
        }
        System.out.println("\n");
     //DO WHILE LOOP
     int s = 0;
        do {
            System.out.print(s+" ");
            s++;
        }while(s<=n);
    }
}
