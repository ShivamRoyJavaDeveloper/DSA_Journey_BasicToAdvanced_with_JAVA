package i04LoopPart01;
import java.util.Scanner;
public class i05_printTheTableOf19 {
    public static void main(String arguments[]){
    Scanner sf =new Scanner(System.in);
    System.out.println("Enter which table you want to learn");
    int n = sf.nextInt();
    for(int i=1; i<=10; i++) {
        System.out.print(n*i+" ");
    }
    System.out.println("\n");

    // 2nd way

        for(int i = n; i<=(10*n); i++){
            if(i%n==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");

        //3rd way
        for(int i =n; i<=(10*n); i+=n){
            System.out.print(i+" ");
        }
        System.out.println("\n");


    }
}
